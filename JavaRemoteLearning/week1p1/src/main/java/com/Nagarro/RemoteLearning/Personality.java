package com.Nagarro.RemoteLearning;

public class Personality {
    private String FirstName;
    private String LastName;
    private String DateOfBirth;
    private String DateOfDeath;


    public Personality(String firstName, String lastName, String dateOfBirth, String dateOfDeath) {
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        DateOfDeath = dateOfDeath;
        System.out.println("\"" + firstName + " " + lastName + " " + dateOfBirth + " - " + dateOfDeath + "\"" );
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getDateOfDeath() {
        return DateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        DateOfDeath = dateOfDeath;
    }
}
