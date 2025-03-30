package Methods_04.Lab;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printSignOfNumber(n);

    }

    private static void printSignOfNumber(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number == 0) {
            System.out.print("The number 0 is zero.");
        }
    }
}
