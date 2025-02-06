package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] command = input.split(" ");
            String action = command[0];

            if (action.equals("swap")) {
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);
                int digit1 = array[firstIndex];
                int digit2 = array[secondIndex];

                array[firstIndex] = digit2;
                array[secondIndex] = digit1;

            } else if (action.equals("multiply")) {
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                int secondIndex = Integer.parseInt(input.split(" ")[2]);
                array[firstIndex] = array[firstIndex] * array[secondIndex];


            } else if (action.equals("decrease")) {

                for (int k = 0; k <= array.length - 1 ; k++) {
                    int finalDigit = --array[k];
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= array.length - 1; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + "," + " ");
            }
        }
    }
}
