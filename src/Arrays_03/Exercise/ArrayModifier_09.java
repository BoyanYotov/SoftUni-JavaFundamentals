package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.
                        stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String command = input.split(" ")[0];

            if (command.equals("swap")){
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);

                int firstNumber = numbers[firstIndex];
                int secondNumber = numbers[secondIndex];

                numbers[firstIndex] = secondNumber;
                numbers[secondIndex] = firstNumber;

            } else if (command.equals("multiply")){
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);

                int product = numbers[firstIndex] * numbers[secondIndex];
                numbers[firstIndex] = product;

            } else if (command.equals("decrease")){
                for (int i = 0; i <= numbers.length-1 ; i++) {
                    numbers[i]--;
                }
            }

            input = scanner.nextLine();
        }

        for (int number = 0; number <= numbers.length - 1 ; number++) {
            if (number == numbers.length-1){
                System.out.print(numbers[number]);
            } else {
                System.out.print(numbers[number] + "," + " ");
            }
        }
    }
}
