package com.nagarro.remotelearing.week10p3.service;

import org.junit.After;
import org.junit.Before;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class TranscodeLatinManagerTest {
    private static final String TEST_INPUT_FILE = "test_input.txt";
    private static final String TEST_OUTPUT_FILE = "test_output.txt";

    @Before
    public void setUp() throws IOException {
        File testInput = new File(TEST_INPUT_FILE);
        boolean created = testInput.createNewFile();
        assertTrue("Failed to create test input file", created);
        Files.write(Paths.get(TEST_INPUT_FILE), "Test data for transcoding".getBytes());
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
    public void transcodeLatin1ToUTF8() throws IOException {
        TranscodeLatinManager.transcodeLatin1ToUTF8(TEST_INPUT_FILE, TEST_OUTPUT_FILE);
        String outputContent = new String(Files.readAllBytes(Paths.get(TEST_OUTPUT_FILE)), StandardCharsets.UTF_8);
        assertEquals("Transcoded content doesn't match", "Test data for transcoding", outputContent);
    }
}