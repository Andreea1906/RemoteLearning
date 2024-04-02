package com.nagarro.remotelearning.week10p2.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileCompressor {
    public static void compress(String inputFile, String outputFile) throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);
        ZipOutputStream zos = new ZipOutputStream(fos);

        zos.putNextEntry(new ZipEntry(inputFile));

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) > 0) {
            zos.write(buffer, 0, len);
        }

        zos.closeEntry();

        double inputSize = fis.getChannel().size();
        double outputSize = fos.getChannel().size();
        double compressionRatio = (inputSize - outputSize) / inputSize * 100;

        System.out.println("Compression rate: " + compressionRatio + "%");

        fis.close();
        zos.close();
    }
}
