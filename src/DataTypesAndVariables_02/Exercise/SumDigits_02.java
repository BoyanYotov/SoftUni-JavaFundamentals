package DataTypesAndVariables_02.Exercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int length = input.length();
        int sum = 0;
        int number = Integer.parseInt(input);

        for (int i = 1; i <= length ; i++) {
            int digit = number % 10;
            sum +=digit;
            number /= 10;
        }

        System.out.println(sum);

    }
}
