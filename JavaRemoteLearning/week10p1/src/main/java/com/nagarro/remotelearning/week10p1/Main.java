package com.nagarro.remotelearning.week10p1;

import com.nagarro.remotelearning.week10p1.service.IntegerFileHandler;

import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = Objects.requireNonNull(Main.class.getClassLoader().getResource("integersFile")).getFile();
            IntegerFileHandler fileHandler = new IntegerFileHandler(filePath);

            int thirdInteger = fileHandler.readThirdInteger();
            System.out.println("Third integer: " + thirdInteger);

            int fourthInteger = fileHandler.readFourthInteger();
            System.out.println("Fourth integer: " + fourthInteger);

            fileHandler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

