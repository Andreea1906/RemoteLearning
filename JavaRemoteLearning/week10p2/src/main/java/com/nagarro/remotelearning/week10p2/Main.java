package com.nagarro.remotelearning.week10p2;

import com.nagarro.remotelearning.week10p2.service.FileCompressor;

import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String inputFile = Objects.requireNonNull(Main.class.getClassLoader().getResource("inputFile")).getFile();
        String outputFile = "D:\\RemoteLearning\\JavaRemoteLearning\\week10p2\\src\\main\\resources\\compressedFile.zip";

        try {
            FileCompressor.compress(inputFile, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

