package Methods_04.Lab;

import java.util.Scanner;

public class MathOperationsV1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(scanner.nextLine());
        double result = 0;

        System.out.printf("%.0f", getMultiplicationOfNumbers(firstNumber, operator, secondNumber, result));

    }

    public static double getMultiplicationOfNumbers(int a, char operator, int b, double result) {
        switch (operator) {
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
        }
        return result;
    }
}
