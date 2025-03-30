package Methods_04.Exercise;

import java.util.Scanner;

public class PalindroneIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            boolean isPalindrome = getPalindromeValue(command);

            System.out.println(isPalindrome);

            command = scanner.nextLine();
        }

    }

    private static boolean getPalindromeValue(String text) {
        String palindrone = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            char letter = text.charAt(i);
            palindrone += letter;
        }
        return palindrone.equals(text);
    }
}
