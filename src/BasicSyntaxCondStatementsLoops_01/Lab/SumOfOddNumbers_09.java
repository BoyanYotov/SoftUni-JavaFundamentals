package BasicSyntaxCondStatementsLoops_01.Lab;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            System.out.println(number);
            sum += number;
            number += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}


