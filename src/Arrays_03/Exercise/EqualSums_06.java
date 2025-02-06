package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.
                        stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        boolean isFound = false;

        for (int i = 0; i <= numbers.length - 1 ; i++) {

            if (numbers.length == 1){
                System.out.println("0");
                break;
            }
            int element = numbers[i];
            int leftSum = 0;
            int rightSum = 0;


            for (int leftposition = 0; leftposition < i; leftposition++) {
                leftSum += numbers[leftposition];
            }

            for (int rightposition = i + 1; rightposition <= numbers.length - 1 ; rightposition++) {
                rightSum += numbers[rightposition];
            }

            if (rightSum == leftSum){
                isFound = true;
                System.out.println(i);
            }
        }

        if (!isFound && numbers.length > 1){
            System.out.println("no");
        }
    }
}
