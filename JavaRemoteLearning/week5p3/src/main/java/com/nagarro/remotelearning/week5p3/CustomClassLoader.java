package com.nagarro.remotelearning.week5p3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class CustomClassLoader extends ClassLoader {
    private final String classFilePath;

    public CustomClassLoader(String classFilePath) {
        this.classFilePath = classFilePath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] bytecode = loadClassFromFile(classFilePath);
            return defineClass(name, bytecode, 0, bytecode.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Class " + name + " not found at " + classFilePath, e);
        }
    }

    private byte[] loadClassFromFile(String filePath) throws IOException {
        File file = new File(filePath);
        try (InputStream inputStream = Files.newInputStream(file.toPath())) {
            long length = file.length();
            byte[] bytecode = new byte[(int) length];
            if (((FileInputStream) inputStream).read(bytecode) != length) {
                throw new IOException("Error reading bytecode from file: " + filePath);
            }
            return bytecode;
        }
    }
}
