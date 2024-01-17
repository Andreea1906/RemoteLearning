import javax.swing.*;
import java.util.Random;

public class SentenceGenerator extends JFrame {
    private static final String[] ARTICLES = {"the", "a", "one", "some", "any"};
    private static final String[] NOUNS = {"boy", "girl", "dog", "town", "car"};
    private static final String[] VERBS = {"drove", "jumped", "ran", "walked", "skipped"};
    private static final String[] PREPOSITIONS = {"to", "from", "over", "under", "on"};

    private static final int BODY_SENTENCES = 14;

    private JTextArea textArea;

    public void RandomStoryGenerator() {
        setTitle("Random Story Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        generateStory();

        setVisible(true);
    }
    private void generateStory() {
        generateIntroduction();
        generateBody();
        generateEnd();
    }
    private void generateIntroduction() {
        textArea.append("Once upon a time, " + selectRandomWord(ARTICLES) + " " + selectRandomWord(NOUNS)
                + ", there lived a " + selectRandomWord(NOUNS) + ".\n");

        textArea.append("Every day, " + capitalizeFirstWord(selectRandomWord(NOUNS)) + " "
                + selectRandomWord(VERBS) + " " + selectRandomWord(PREPOSITIONS) + " "
                + selectRandomWord(ARTICLES) + " " + selectRandomWord(NOUNS) + ".\n");

        textArea.append("One day, " + capitalizeFirstWord(selectRandomWord(NOUNS)) + " "
                + selectRandomWord(VERBS) + " " + selectRandomWord(PREPOSITIONS) + " "
                + selectRandomWord(ARTICLES) + " " + selectRandomWord(NOUNS) + ".\n\n");
    }
    private void generateBody() {
        for (int i = 0; i < BODY_SENTENCES; i++) {
            textArea.append(capitalizeFirstWord(selectRandomWord(NOUNS)) + " " + selectRandomWord(VERBS) + " "
                    + selectRandomWord(PREPOSITIONS) + " " + selectRandomWord(ARTICLES)
                    + " " + selectRandomWord(NOUNS) + " and " + selectRandomWord(NOUNS)
                    + " " + selectRandomWord(VERBS) + " " + selectRandomWord(PREPOSITIONS)
                    + " " + selectRandomWord(ARTICLES) + " " + selectRandomWord(NOUNS) + ".\n");

        }
    }

    private void generateEnd() {
        textArea.append("\nIn the end, " + capitalizeFirstWord(selectRandomWord(NOUNS)) + " "
                + selectRandomWord(VERBS) + " " + selectRandomWord(PREPOSITIONS) + " "
                + selectRandomWord(ARTICLES) + " " + selectRandomWord(NOUNS) + ".\n");

        textArea.append("And so, " + capitalizeFirstWord(selectRandomWord(NOUNS)) + " "
                + selectRandomWord(VERBS) + " " + selectRandomWord(PREPOSITIONS) + " "
                + selectRandomWord(ARTICLES) + " " + selectRandomWord(NOUNS) + ".\n");

        textArea.append("The story concludes as " + capitalizeFirstWord(selectRandomWord(NOUNS)) + " "
                + selectRandomWord(VERBS) + " " + selectRandomWord(PREPOSITIONS) + " "
                + selectRandomWord(ARTICLES) + " " + selectRandomWord(NOUNS) + ".\n");
    }

    private String selectRandomWord(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    private String capitalizeFirstWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

}
