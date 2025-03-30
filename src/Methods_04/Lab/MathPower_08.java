package Methods_04.Lab;

import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", returnPower(a, b));
    }

    private static double returnPower(int a, int b) {
        double result = Math.pow(a, b);
        return result;
    }
}
