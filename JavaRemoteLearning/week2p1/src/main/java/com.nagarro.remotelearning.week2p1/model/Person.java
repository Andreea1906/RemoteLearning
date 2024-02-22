public class Person {
    private String[] firstNames;
    private String surname;

    public Person(String[] firstNames, String surname) {
        this.firstNames = firstNames;
        this.surname = surname;
    }

    public Person(String fullName) {
        String[] names = fullName.split(" ");
        if (names.length > 1) {
            this.surname = names[names.length - 1];
            this.firstNames = new String[names.length - 1];
            for (int i = 0; i < names.length - 1; i++) {
                this.firstNames[i] = names[i];
            }
        } else {
            this.firstNames = new String[]{fullName};
            this.surname = "";
        }
    }

    public String getFirstNames() {
        return String.join("-", firstNames);
    }

    public String getSurname() {
        return surname;
    }
}