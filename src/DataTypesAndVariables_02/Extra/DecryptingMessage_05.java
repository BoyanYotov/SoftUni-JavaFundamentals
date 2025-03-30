package DataTypesAndVariables_02.Extra;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 1; i <= n; i++) {
            char character = scanner.nextLine().charAt(0);

            char newChar = (char) (character + key);
            message += newChar;

        }
        System.out.println(message);
    }
}
