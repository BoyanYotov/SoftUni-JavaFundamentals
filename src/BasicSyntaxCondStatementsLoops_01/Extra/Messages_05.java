package BasicSyntaxCondStatementsLoops_01.Extra;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int offset = 0;

        for (int i = 1; i <= n ; i++) {

            String input = scanner.nextLine();
            int length = input.length();
            int number = Integer.parseInt(input);
            int mainDigit = number % 10;

            offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9){
                offset += 1;
            }

            int index = (offset + length - 1) + 97;

            if (mainDigit == 0){
                index = 32;
            }

            char letter = (char) index;

            System.out.print(letter);

        }

    }
}
