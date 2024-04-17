package com.nagarro.remotelearning.week10p2.service;

import org.junit.After;
import org.junit.Before;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class FileCompressorTest {
    private static final String TEST_INPUT_FILE = "test_input.txt";
    private static final String TEST_OUTPUT_FILE = "test_output.zip";

    @Before
    public void setUp() throws IOException {
        File testInput = new File(TEST_INPUT_FILE);
        boolean created = testInput.createNewFile();
        assertTrue("Failed to create test input file", created);
    }

    @After
    public void tearDown() {
        File testInput = new File(TEST_INPUT_FILE);
        File testOutput = new File(TEST_OUTPUT_FILE);
        boolean inputDeleted = testInput.delete();
        boolean outputDeleted = testOutput.delete();
        assertTrue("Failed to delete test input file", inputDeleted);
        assertTrue("Failed to delete test output file", outputDeleted);
    }
    @org.junit.Test
    public void compress() throws IOException {
        try (FileOutputStream fos = new FileOutputStream(TEST_INPUT_FILE)) {
            fos.write("Test data for compression".getBytes());
        }

        FileCompressor.compress(TEST_INPUT_FILE, TEST_OUTPUT_FILE);

        File outputFile = new File(TEST_OUTPUT_FILE);
        assertTrue(outputFile.exists());
    }
}
