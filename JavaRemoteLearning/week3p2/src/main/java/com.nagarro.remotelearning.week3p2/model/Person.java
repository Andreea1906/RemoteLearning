package entity;

import java.util.Date;

public abstract class Person {
    private String[] firstNames;
    private String surname;
    private int age;

    public Person(String[] firstNames, String surname, int age) {
        this.firstNames = firstNames;
        this.surname = surname;
        this.age = age;
    }

   public abstract String getBirthDate();
   public abstract String selfDescribe();

    public String getFirstNames() {
        return String.join("-", firstNames);
    }

    public String getSurname() {
        return surname;
    }
    public int getAge(){return  age;}

}
