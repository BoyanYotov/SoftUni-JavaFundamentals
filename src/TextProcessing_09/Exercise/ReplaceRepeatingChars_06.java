package TextProcessing_09.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder newMessage = new StringBuilder();
        newMessage.append(input.charAt(0));

        for (int i = 1; i <= input.length() - 1; i++) {
            char symbol = input.charAt(i);
            if (symbol != input.charAt(i - 1)) {
                newMessage.append(symbol);
            }
        }

        System.out.println(newMessage);

    }
}
