package Methods_04.Lab;

import java.util.Scanner;

public class MultiplyEvensByOddsV1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    private static int getMultipleOfEvensAndOdds(int number){
        int sumEven = 0;
        int sumOdd = 0;

        while (number > Integer.MIN_VALUE){

            int lastDigit = number % 10;

            if (lastDigit % 2 == 0){
                sumEven += lastDigit;
            } else {
                sumOdd += lastDigit;
            }

            number /= 10;

            if (number == 0){
                break;
            }
        }
        return sumOdd * sumEven;
    }

}
