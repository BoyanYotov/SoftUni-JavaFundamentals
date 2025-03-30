package Methods_04.Lab;

import java.util.Scanner;

public class MathOperationsV2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case '/':
                divide(firstNumber, secondNumber);
                break;
            case '*':
                multiply(firstNumber, secondNumber);
                break;
            case '+':
                add(firstNumber, secondNumber);
                break;
            case '-':
                subtract(firstNumber, secondNumber);
                break;
        }
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
