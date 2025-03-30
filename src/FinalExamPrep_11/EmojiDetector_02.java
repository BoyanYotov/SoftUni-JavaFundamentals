package FinalExamPrep_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        BigDecimal threshold = new BigDecimal("1");

        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                int digit = Integer.parseInt(String.valueOf(symbol));
                BigDecimal letter = new BigDecimal(digit);
                threshold = threshold.multiply(letter);
            }
        }

        System.out.printf("Cool threshold: %s\n", threshold);

        String regex = "(:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> coolEmojis = new ArrayList<>();
        int countEmoji = 0;
        while (matcher.find()) {
            String emoji = matcher.group("emoji");
            int emojiCoolness = 0;

            for (char symbol : emoji.toCharArray()) {
                emojiCoolness += symbol;
            }

            if (emojiCoolness > Integer.parseInt(String.valueOf(threshold))) {
                coolEmojis.add(matcher.group());
            }
            countEmoji++;
        }

        System.out.printf("%d emojis found in the text. ", countEmoji);
        System.out.println("The cool ones are:");
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji + " ");
        }
    }
}
