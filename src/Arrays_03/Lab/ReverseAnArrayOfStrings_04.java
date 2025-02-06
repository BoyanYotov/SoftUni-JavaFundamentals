package Arrays_03.Lab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = input.length-1; i >= 0; i--) {
            System.out.print(input[i] + " ");
        }
    }
}
