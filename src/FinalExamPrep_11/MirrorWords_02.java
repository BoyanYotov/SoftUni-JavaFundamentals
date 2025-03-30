package FinalExamPrep_11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(@|#)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Map<String, String> wordPairs = new LinkedHashMap<>();

        int validWordsCount = 0;
        while (matcher.find()) {
            validWordsCount++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            StringBuilder sb = new StringBuilder(secondWord).reverse();

            if (firstWord.equals(sb.toString())) {
                wordPairs.put(firstWord, secondWord);
            }

        }
        if (validWordsCount > 0) {
            System.out.printf("%d word pairs found!\n", validWordsCount);
        } else {
            System.out.println("No word pairs found!");
        }


        List<String> words = new ArrayList<>();
        for (Map.Entry<String, String> entry : wordPairs.entrySet()) {
            String wordToAdd = entry.getKey() + " <=> " + entry.getValue();
            words.add(wordToAdd);
        }

        if (words.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", words));
        }
    }
}
