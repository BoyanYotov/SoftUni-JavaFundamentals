package TextProcessing_09.Exercise;

import java.util.Scanner;

public class CaeserSipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder newMessage = new StringBuilder();

        for (int i = 0; i <= input.length() - 1; i++) {
            char newChar = (char) (input.charAt(i) + 3);
            newMessage.append(newChar);
        }

        System.out.println(newMessage);
    }
}
