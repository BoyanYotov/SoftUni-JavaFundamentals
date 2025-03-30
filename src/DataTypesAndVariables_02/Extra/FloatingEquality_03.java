package DataTypesAndVariables_02.Extra;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        BigDecimal first = new BigDecimal(String.valueOf(firstNumber));
        BigDecimal second = new BigDecimal(String.valueOf(secondNumber));

        BigDecimal result = first.subtract(second).abs();
        BigDecimal eps = new BigDecimal("0.000001");

        int i = returnResult(result, eps);

        if (i < 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    private static int returnResult(BigDecimal result, BigDecimal eps) {
        return result.compareTo(eps);
    }
}

