package DataTypesAndVariables_02.Exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int startYield = Integer.parseInt(scanner.nextLine());
    int totalSum = 0;
    int daysCount = 0;

        for (int i = startYield; i >= 100 ; i -= 10) {
            int extact = i;
            totalSum += extact;

            if (totalSum >= 26) {
                totalSum -= 26;
            }else {
                totalSum = 0;
            }

            daysCount++;
        }

        if (totalSum >= 26) {
            totalSum -= 26;
        } else {
            totalSum = 0;}

        System.out.printf("%d%n%d", daysCount, totalSum);
    }
}
