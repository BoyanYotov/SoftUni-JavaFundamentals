package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean isFound = false;

        for (int index = 0; index <= array.length - 1; index++) {

            if (array.length == 1){
                break;
            }

            int sumLeft = 0;
            int sumRight = 0;

            for (int i = 0; i <= index - 1; i++) {
                int rightDigit = array[i];
                sumRight += rightDigit;
            }

            for (int j = index + 1; j <= array.length - 1; j++) {
                int leftDigit = array[j];
                sumLeft += leftDigit;
            }


            if (sumRight == sumLeft) {
                System.out.println(index);
                isFound = true;
            }
        }

        if (!isFound && array.length > 1){
            System.out.println("no");
        } else if (array.length == 1)
            System.out.println("0");
        }
    }

