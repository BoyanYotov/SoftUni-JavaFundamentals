package ClassesAndObjects_07.Lab;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= n ; i++) {
            BigInteger j = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(j);
        }


        System.out.println(factorial);
    }
}
