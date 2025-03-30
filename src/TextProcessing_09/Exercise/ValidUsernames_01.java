package TextProcessing_09.Exercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            boolean isLengthValid = true;
            boolean areCharsValid = true;

            if (username.length() < 3 || username.length() > 16) {
                isLengthValid = false;
            }

            for (int i = 0; i <= username.length() - 1; i++) {
                char symbol = username.charAt(i);

                if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                    areCharsValid = false;
                }
            }

            if (isLengthValid && areCharsValid) {
                System.out.println(username);
            }
        }
    }
}
