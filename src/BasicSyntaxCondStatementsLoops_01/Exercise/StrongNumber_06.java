package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());
        int number = initialNumber;

        int sumFactoral = 1;
        int totalSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            for (int i = lastDigit; i >= 1; i--) {
                sumFactoral*=i;
            }

            totalSum += sumFactoral;
            sumFactoral = 1;
            number /= 10;
        }

        if (totalSum == initialNumber){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}