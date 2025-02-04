package BasicSyntaxCondStatementsLoops_01.Extra;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String reversedInput = "";
        char letter = 0;

        for (int i = input.length()-1; i >= 0 ; i--) {
            letter = input.charAt(i);
            reversedInput += letter;
        }

        System.out.println(reversedInput);

    }
}
