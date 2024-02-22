import com.nagarro.remotelearning.week5p1.DateFormatter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Please enter a date: \n");
        Scanner scanner = new Scanner(System.in);
        DateFormatter customDateFormatter = new DateFormatter();
        System.out.println(customDateFormatter.formatDate(scanner.nextLine()));
    }
}

