package Arrays_03.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumInput1 = 0;
        boolean isEqual = true;

        for (int i = 0; i <= Integer.max(input1.length-1,input2.length-1) ; i++) {
            if (input1[i] == input2[i]){
                sumInput1 += input1[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                isEqual = false;
                break;
            }
        }

        if (isEqual){
            System.out.printf("Arrays are identical. Sum: %d",sumInput1);
        }

    }
}
