package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbers.length - 1; i++) {
            int firstDigit = numbers[i];

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int secondDigit = numbers[j];

                if (firstDigit + secondDigit == magicNumber) {
                    System.out.println(firstDigit + " " + secondDigit);
                }
            }
        }
    }
}