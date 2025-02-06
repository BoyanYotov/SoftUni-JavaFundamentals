package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArray_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[rows];
        int[] secondArray = new int[rows];

        for (int lines = 1; lines <= rows ; lines++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int firstNumber = numbers[0];
            int secondNumber = numbers[1];

            if (lines % 2 == 0){
                secondArray[lines-1] = firstNumber;
                firstArray[lines-1] = secondNumber;
            } else {
                secondArray[lines-1] = secondNumber;
                firstArray[lines-1] = firstNumber;
            }
        }

        for (int i : firstArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j : secondArray) {
            System.out.print(j+" ");
        }





    }
}
