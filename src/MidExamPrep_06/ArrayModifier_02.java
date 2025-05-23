package MidExamPrep_06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int firstNumber = numbers[index1];
                int secondNumber = numbers[index2];
                numbers[index1] = secondNumber;
                numbers[index2] = firstNumber;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int firstNumber = numbers[index1];
                int secondNumber = numbers[index2];
                numbers[index1] = firstNumber * secondNumber;

            } else if (command.contains("decrease")) {
                for (int i = 0; i <= numbers.length - 1; i++) {
                    numbers[i] -= 1;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
