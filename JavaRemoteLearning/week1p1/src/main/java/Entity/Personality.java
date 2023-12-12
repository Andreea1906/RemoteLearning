package Entity;

import java.util.Objects;

public class Personality {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfDeath;


    public Personality(String firstName, String lastName, String dateOfBirth, String dateOfDeath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personality that = (Personality) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(dateOfDeath, that.dateOfDeath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfDeath);
    }
}
