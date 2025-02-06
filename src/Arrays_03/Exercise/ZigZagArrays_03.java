package Arrays_03.Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();

        int firstNumber = Integer.parseInt(input.split(" ")[0]);
        int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if (i % 2 != 0){
                firstArray[i-1] = firstNumber;
                secondArray[i-1] = secondNumber;
            } else {
                firstArray[i-1] = secondNumber;
                secondArray[i-1] = firstNumber;
            }
        }

        for (int i : firstArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : secondArray) {
            System.out.print(i + " ");
        }
    }
}
