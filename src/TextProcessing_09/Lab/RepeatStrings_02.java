package TextProcessing_09.Lab;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (String word : input) {
            int length = word.length();

            System.out.print(word.repeat(length));
        }
    }
}
