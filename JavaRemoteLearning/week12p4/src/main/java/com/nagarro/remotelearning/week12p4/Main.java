package com.nagarro.remotelearning.week12p4;

import com.nagarro.remotelearning.week12p4.util.PersonManager;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> persons = Arrays.asList("18:Maria", "18:Marioara", "17:Ionut", "15:Marcel", "21:Vasile", "20:Mihai");
        PersonManager personManager = new PersonManager(persons);

        System.out.println("Persons older than 18:");
        personManager.getPersonsOlderThan18().forEach(System.out::println);

        System.out.println("\nThe oldest person:");
        System.out.println(personManager.getOldestPerson());

        System.out.println("\nAre all persons younger than 80?");
        System.out.println(personManager.areAllYoungerThan80() ? "Yes" : "No");
    }
}

