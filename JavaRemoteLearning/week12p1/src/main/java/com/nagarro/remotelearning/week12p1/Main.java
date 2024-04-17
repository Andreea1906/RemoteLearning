package com.nagarro.remotelearning.week12p1;

import com.nagarro.remotelearning.week12p1.util.SubdirectoriesFinder;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String directoryPath = "src/main/resources";
        SubdirectoriesFinder subdirectoriesFinder = new SubdirectoriesFinder();

        File[] subdirectoriesLambda = subdirectoriesFinder.findSubdirectoriesLambda(directoryPath);
        System.out.println("Subdirectories found using lambda:");
        Arrays.stream(subdirectoriesLambda).forEach(System.out::println);

        File[] subdirectoriesMethodRef = subdirectoriesFinder.findSubdirectoriesMethodReference(directoryPath);
        System.out.println("\nSubdirectories found using method reference:");
        Arrays.stream(subdirectoriesMethodRef).forEach(System.out::println);

        subdirectoriesFinder.printSubdirectories(directoryPath);
    }
}
