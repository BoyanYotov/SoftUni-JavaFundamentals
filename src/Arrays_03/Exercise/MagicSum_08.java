package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.
                stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbers.length - 1; i++) {
            int firstNumber = numbers[i];

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int secondNumber = numbers[j];

                if (firstNumber + secondNumber == magicNumber) {
                    System.out.println(firstNumber + " " + secondNumber);
                }
            }
        }
    }
}
