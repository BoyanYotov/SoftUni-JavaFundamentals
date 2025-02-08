package Methods_04.Lab;

import java.util.Scanner;

public class CalculationsV1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int result = 0;
        System.out.println(printResult(command,firstNumber,secondNumber,result));
    }

    private static int printResult(String command, int num1, int num2, int result){
        switch (command) {
            case "add" -> result = num1 + num2;
            case "multiply" -> result = num1 * num2;
            case "subtract" -> result = num1 - num2;
            case "divide" -> result = num1 / num2;
        }
        return result;
    }
}
