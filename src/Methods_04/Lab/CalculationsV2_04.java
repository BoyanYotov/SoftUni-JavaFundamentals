package Methods_04.Lab;

import java.util.Scanner;

public class CalculationsV2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add" -> resultAdd(firstNumber,secondNumber);
            case "multiply" -> resultMultiply(firstNumber,secondNumber);
            case "divide" -> resultDivide(firstNumber,secondNumber);
            case "subtract" -> resultSubtract(firstNumber,secondNumber);
        }
    }

    private static void resultAdd(int a, int b){
        System.out.println(a + b);
    }

    private static void resultSubtract (int a, int b){
        System.out.println(a - b);
    }

    private static void resultDivide (int a, int b){
        System.out.println(a / b);
    }

    private static void resultMultiply (int a, int b){
        System.out.println(a * b);
    }

}
