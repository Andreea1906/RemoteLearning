package com.nagarro.remotelearning.week10p1.service;

import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class IntegerFileHandlerTest {
    private static final String TEST_FILE_PATH = "integersFileTest.dat";
    private static final int[] TEST_DATA = {10, 20, 30, 40};

    @Before
    public void setUp() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(TEST_FILE_PATH, "rw")) {
            for (int value : TEST_DATA) {
                file.writeInt(value);
            }
        }
    }

    @After
    public void tearDown() {
        try {
            Files.deleteIfExists(Paths.get(TEST_FILE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void readThirdInteger() throws IOException {
        IntegerFileHandler fileHandler = new IntegerFileHandler(TEST_FILE_PATH);
        assertEquals(TEST_DATA[2], fileHandler.readThirdInteger());
        fileHandler.close();
    }

    @org.junit.Test
    public void readFourthInteger() throws IOException {
        IntegerFileHandler fileHandler = new IntegerFileHandler(TEST_FILE_PATH);
        assertEquals(TEST_DATA[3], fileHandler.readFourthInteger());
        fileHandler.close();
    }
}