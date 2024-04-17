package com.nagarro.remotelearning.week12p1.util;

import java.io.File;

public class SubdirectoriesFinder {

    public File[] findSubdirectoriesLambda(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.listFiles(file -> file.isDirectory());
    }

    public File[] findSubdirectoriesMethodReference(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.listFiles(File::isDirectory);
    }
    //metoda care listeaza folderele fara sa foloseasca niciuna dintre metode
    public void printSubdirectories(String directoryPath) {
        File directory = new File(directoryPath);
        File[] subdirectories = directory.listFiles(File::isDirectory);
        if (subdirectories != null) {
            System.out.println("Subdirectories found using traditional method:");
            for (File subdirectory : subdirectories) {
                System.out.println(subdirectory.getName());
            }
        } else {
            System.out.println("No subdirectories found.");
        }
    }

}
