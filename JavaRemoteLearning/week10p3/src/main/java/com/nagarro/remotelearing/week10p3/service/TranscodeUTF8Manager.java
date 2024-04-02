package com.nagarro.remotelearing.week10p3.service;

import java.io.*;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TranscodeUTF8Manager {
    public static void transcodeUTF8ToLatin1(String inputFile, String outputFile) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(inputFile)), StandardCharsets.UTF_8));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get(outputFile)), StandardCharsets.ISO_8859_1))) {
            int nextChar;
            while ((nextChar = bufferedReader.read()) != -1) {
                try {
                    bufferedWriter.write(nextChar);
                } catch (CharacterCodingException e) {
                    bufferedWriter.write('?');
                }
            }
        }
    }
}