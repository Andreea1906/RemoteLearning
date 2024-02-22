import javax.swing.*;
import java.util.Random;

public class SentenceGenerator {
    private static final String[] ARTICLES = {"the", "a", "one", "some", "any"};
    private static final String[] NOUNS = {"boy", "girl", "dog", "town", "car"};
    private static final String[] VERBS = {"drove", "jumped", "ran", "walked", "skipped"};
    private static final String[] PREPOSITIONS = {"to", "from", "over", "under", "on"};



    private void generateStory() {
        for (int i = 0; i < 20; i++) {
            System.out.println(capitalizeFirstWord(selectRandomWord(NOUNS)) + " " + selectRandomWord(VERBS) + " "
                    + selectRandomWord(PREPOSITIONS) + " " + selectRandomWord(ARTICLES)
                    + " " + selectRandomWord(NOUNS) + " and " + selectRandomWord(NOUNS)
                    + " " + selectRandomWord(VERBS) + " " + selectRandomWord(PREPOSITIONS)
                    + " " + selectRandomWord(ARTICLES) + " " + selectRandomWord(NOUNS) + ".\n");



    private String selectRandomWord(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    private String capitalizeFirstWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

}
