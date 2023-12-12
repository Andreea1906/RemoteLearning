import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Using constructor with multiple first names and surname
        String[] names1 = {"Cristina", "Mihaela", "Andreea"};
        Person person1 = new Person(names1, "Popescu");
        System.out.println(person1.getFirstNames() + " " + person1.getSurname());


        // Using constructor with single first name and surname
        String fullName = "Andreea Popescu";
        Person person2 = new Person(fullName);
        System.out.println(person2.getFirstNames() + " " + person2.getSurname());
    }
}


