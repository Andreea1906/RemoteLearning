package com.Nagarro.RemoteLearning;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    public static String[] readLinesFromTextFile(String file) throws IOException {
        String[] result = new String[0];
        DataInputStream inputStream = new DataInputStream(Files.newInputStream(Paths.get("personalities.csv")));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String strLine = null;

        try {
            List<Personality> PersonalitiesList = new ArrayList<>();
            while ((strLine = bufferedReader.readLine()) != null) {
                result = addLineToArray(result, strLine);
                String FirstName = result[0];
                String LastName = result[1];
                String DateOfBirth = result[2];
                String DateOfDeath = result[3];

                Personality personality = new Personality(FirstName,LastName,DateOfBirth,DateOfDeath);
                PersonalitiesList.add(personality);

            }
            System.out.println(PersonalitiesList);
        } finally {
            inputStream.close();
        }
        return result;
    }

    private static String[] addLineToArray(String[] input, String line) {
        String[] result = new String[input.length + 1];
        System.arraycopy(input, 0, result, 0, input.length);
        result[input.length] = line;
        return result;
    }

}