import java.util.Scanner;
import java.util.StringTokenizer;

public class PigLatinConverter {

    public void startConversion() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an English sentence (or type 'exit' to quit): ");
            String inputSentence = scanner.nextLine();

            if (inputSentence.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the Pig Latin Converter. Goodbye!");
                break;
            }

            String pigLatinSentence = convertToPigLatin(inputSentence);
            System.out.println("Pig Latin: " + pigLatinSentence);
        }

        scanner.close();
    }

    public String convertToPigLatin(String inputSentence) {
        StringTokenizer tokenizer = new StringTokenizer(inputSentence);
        StringBuilder pigLatinSentence = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            String pigLatinWord = convertWordToPigLatin(word);
            pigLatinSentence.append(pigLatinWord).append(" ");
        }

        return pigLatinSentence.toString().trim();
    }

    private String convertWordToPigLatin(String word) {
        if (word.length() >= 2) {
            String pigLatinWord = word.substring(1) + word.charAt(0) + "ay";
            return pigLatinWord.toLowerCase();
        } else {
            return word;
        }
    }
}
