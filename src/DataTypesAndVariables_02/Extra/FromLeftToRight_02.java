package DataTypesAndVariables_02.Extra;

import java.util.Scanner;

public class FromLeftToRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            long firstNumber = Long.parseLong(input[0]);
            long secondNumber = Long.parseLong(input[1]);


            if (firstNumber > secondNumber){
                Long l = calculateSumOfFirstNumber(firstNumber);
                System.out.println(l);
            } else if (secondNumber >= firstNumber){
                Long l = calculateSumOfSecondNumber(secondNumber);
                System.out.println(l);
            }
        }
    }

    private static Long calculateSumOfFirstNumber(long firstNumber){
        long sumFirstNumber = 0;
        firstNumber = Math.abs(firstNumber);
        while (firstNumber > 0 ){
            int lastDigit = (int) (firstNumber % 10);
            sumFirstNumber += lastDigit;
            firstNumber /= 10;
        } return sumFirstNumber;
    }

    private static Long calculateSumOfSecondNumber(long secondNumber){
        long sumSecondNumber = 0;
        secondNumber = Math.abs(secondNumber);
        while (secondNumber > 0 ){
            int lastDigit = (int) (secondNumber % 10);
            sumSecondNumber += lastDigit;
            secondNumber /= 10;
        } return sumSecondNumber;
    }

}
