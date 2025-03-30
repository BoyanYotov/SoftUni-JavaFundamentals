package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (numbers.length == 1) {
            System.out.println(numbers[0]);
            return;
        }

        while (numbers.length > 1) {
            int[] newArray = new int[numbers.length - 1];

            for (int i = 0; i < numbers.length - 1; i++) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[i + 1];
                newArray[i] = firstNumber + secondNumber;
            }

            numbers = newArray;

        }

        System.out.println(numbers[0]);
    }
}