package Methods_04.Lab;

import java.util.Scanner;

public class GreaterOfTwoValuesV2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        executeComparisonByType(scanner, type);

    }

    private static void executeComparisonByType(Scanner scanner, String type) {
        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                executeOperation(firstNumber, secondNumber);
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                executeOperation(firstSymbol, secondSymbol);
                break;
            case "string":
                String firstName = scanner.nextLine();
                String secondName = scanner.nextLine();
                executeOperation(firstName, secondName);
                break;
        }
    }

    private static void executeOperation(int a, int b) {
        System.out.println(Math.max(a, b));
    }

    private static void executeOperation(char a, char b) {
        System.out.println((char) Math.max(a, b));
    }

    private static void executeOperation(String a, String b) {
        if (a.equals(b)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

}
