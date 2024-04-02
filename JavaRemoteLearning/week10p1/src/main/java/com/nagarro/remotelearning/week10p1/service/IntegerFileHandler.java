package com.nagarro.remotelearning.week10p1.service;

import java.io.IOException;
import java.io.RandomAccessFile;

public class IntegerFileHandler {
    private RandomAccessFile file;

    public IntegerFileHandler(String filePath) throws IOException {
        file = new RandomAccessFile(filePath, "r");
    }

    public int readThirdInteger() throws IOException {
        file.seek(2 * Integer.BYTES);
        return file.readInt();
    }

    public int readFourthInteger() throws IOException {
        file.seek(3 * Integer.BYTES);
        return file.readInt();
    }

    public void close() throws IOException {
        file.close();
    }
}

