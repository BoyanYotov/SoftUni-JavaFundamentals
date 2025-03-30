package Methods_04.Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            if (checkIfDivisibleByEight(i) && checkIfHasOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkIfDivisibleByEight(int a) {
        int sum = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            sum += lastDigit;
            a /= 10;
        }

        return (sum % 8 == 0);
    }

    private static boolean checkIfHasOneOddDigit(int a) {
        while (a > 0) {
            int lastDigit = a % 10;

            if (lastDigit % 2 != 0) {
                return true;
            }
            a /= 10;
        }
        return false;
    }

}
