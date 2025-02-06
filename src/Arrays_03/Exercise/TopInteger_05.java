package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.
                        stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int i = 0; i <= numbers.length - 1 ; i++) {
            int firstNumber = numbers[i];
            boolean isTop = true;

            for (int j = i + 1 ; j <= numbers.length - 1 ; j++) {
            int secondNumber = numbers[j];

            if (firstNumber <= secondNumber){
                isTop = false;
                }
            }

            if (isTop){
                System.out.print(firstNumber + " ");
            }

        }
    }
}
