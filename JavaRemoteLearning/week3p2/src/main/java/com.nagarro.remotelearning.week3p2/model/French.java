package entity;

import entity.Person;

public class French extends Person {
    public French(String[] firstNames, String surname, int age) {
        super(firstNames, surname, age);
    }

    @Override
    public String getBirthDate() {
        return "1 janvier 2000";
    }

    @Override
    public String selfDescribe() {
        return "Bonjour, je m'appelle " + getFirstNames() + " " + getSurname() + ". J'ai " + getAge() + " ans. Je viens de France.";
    }
}

