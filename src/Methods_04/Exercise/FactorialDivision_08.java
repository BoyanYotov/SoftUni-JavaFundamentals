package Methods_04.Exercise;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calculateFactorial(firstNumber);
        long secondFactorial = calculateFactorial(secondNumber);

        double result = firstFactorial / (secondFactorial * 1.0);
        System.out.printf ("%.2f",result);
    }

    private static long calculateFactorial(int a){
        long factorial = 1;

        for (int i = 2; i <= a ; i++) {
            factorial *= i;
        }

        return factorial;
    }


}
