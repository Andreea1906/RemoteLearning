package com.nagarro.remotelearing.week10p3.service;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TranscodeLatinManager {
    public static void transcodeLatin1ToUTF8(String inputFile, String outputFile) throws IOException {
        try (InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(Paths.get(inputFile)), StandardCharsets.ISO_8859_1);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Files.newOutputStream(Paths.get(outputFile)), StandardCharsets.UTF_8)) {
            char[] buffer = new char[1024];
            int bytesRead;
            while ((bytesRead = inputStreamReader.read(buffer)) != -1) {
                outputStreamWriter.write(buffer, 0, bytesRead);
            }
        }
    }
}


