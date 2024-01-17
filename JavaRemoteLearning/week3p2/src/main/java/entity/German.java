package entity;

import entity.Person;

public class German extends Person {
    public German(String[] firstNames, String surname, int age) {
        super(firstNames, surname, age);
    }

    @Override
    public String getBirthDate() {
        return "18 Oktober 1997";
    }

    @Override
    public String selfDescribe() {
        return "Hallo, mein name ist " + getFirstNames() + " " + getSurname() + ". Ich bin  " + getAge() + " jahre alt. Ich bin aus Deutschland.";
    }
}
