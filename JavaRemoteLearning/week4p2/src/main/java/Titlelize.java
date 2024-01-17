package week4p2.src.main.java;


import java.util.*;

public class Titlelize implements Titlelizer {
    private final Set<String> ignoreWords ;

    public Titlelize() {
        ignoreWords = new HashSet<>();
        ignoreWords.add("the");
        ignoreWords.add("a");
        ignoreWords.add("to");
        ignoreWords.add("in");
        ignoreWords.add("of");
    }
    
    @Override
    public String titlelize(String toTitlelize) {
        String[] words = toTitlelize.split(" ");
        StringBuilder titlelizedStringBuilder = new StringBuilder();
        for (String word : words) {
            if (!ignoreWords.contains(word.toLowerCase())) {
                titlelizedStringBuilder.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }

                else
            {
                titlelizedStringBuilder.append(word).append(" ");
            }
        }
        
        return titlelizedStringBuilder.toString().trim();
    }
}
