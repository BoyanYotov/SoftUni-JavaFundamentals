package BasicSyntaxCondStatementsLoops_01.Extra;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            int length = input.length();
            int mainDigit = Integer.parseInt(input) % 10;

            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9){
                offset++;
            }

            int index = (offset + length-1);
            int finalLetter = index + 97;

            if (finalLetter == 91){
                finalLetter = 32;
            }
            System.out.print((char) finalLetter);
        }

    }
}
