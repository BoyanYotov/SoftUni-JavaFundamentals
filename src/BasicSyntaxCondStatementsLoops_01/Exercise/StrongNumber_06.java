package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());
        int number = initialNumber;

        int factorial = 1;
        int factorialSum = 0;

        while (number > 0){
            int lastDigit = number % 10;

            for (int i = 1; i <= lastDigit ; i++) {
                factorial *= i;
            }

            factorialSum += factorial;
            factorial = 1;

            number /= 10;
        }

        if (factorialSum == initialNumber){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}