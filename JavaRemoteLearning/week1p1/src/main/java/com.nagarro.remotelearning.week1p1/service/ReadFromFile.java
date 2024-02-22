package Entity;

import Entity.Personality;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadFromFile {

    public static String[] readLinesFromTextFile(String file) throws IOException {
        String[] result = new String[0];
        DataInputStream inputStream = new DataInputStream(Files.newInputStream(Paths.get(file)));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String strLine = null;

        try {
            Set<Personality> PersonalitiesSet = new HashSet<>();
            while ((strLine = bufferedReader.readLine()) != null) {

                result = addLineToArray(result, strLine);
                String firstName = result[0];
                String lastName = result[1];
                String dateOfBirth = result[2];
                String dateOfDeath = result[3];

                if(result[3] != null){
                    Personality personality = new Personality(firstName, lastName, dateOfBirth, dateOfDeath);
                    PersonalitiesSet.add(personality);
                }
                else {
                    Personality personality = new Personality(firstName, lastName, dateOfBirth, null);
                    PersonalitiesSet.add(personality);
                }

            }

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