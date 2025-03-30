package Methods_04.Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String text) {
        if (text.length() % 2 == 0) {
            char[] middles = {text.charAt(text.length() / 2 - 1), text.charAt(text.length() / 2)};

            for (int i = 0; i <= middles.length - 1; i++) {
                System.out.print(middles[i]);
            }

        } else {
            char middle = text.charAt(text.length() / 2);
            System.out.println(middle);
        }
    }
}
