import entity.French;
import entity.German;

public class Main {
    public static void main(String[] args) {
        German german = new German(new String[]{"Heinz"},"Feigenbaum", 27);
        French french = new French(new String[]{"Marie Suzette"},"LaCroix", 24);

        System.out.println(german.selfDescribe());
        System.out.println("Geburtsdatum: " + german.getBirthDate());
        System.out.println();
        System.out.println(french.selfDescribe());
        System.out.println("Date de naissance : " + french.getBirthDate());
    }
}
