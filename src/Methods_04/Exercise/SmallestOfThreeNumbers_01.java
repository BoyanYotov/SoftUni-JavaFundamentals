package Methods_04.Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        printSmallestOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
    }

    private static void printSmallestOfThreeNumbers (int a, int b, int c ){
        System.out.println(Math.min(a,(Math.min(b,c))));
    }
}
