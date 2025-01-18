package DataTypesAndVariables_02.Exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int startYield = Integer.parseInt(scanner.nextLine());
    int sum = 0;
    int days = 0;

        for (int i = startYield; i >= 100 ; i-=10) {
            int extact = i;
            sum += extact;
            if (sum >= 26) {
                sum -= 26;
            }else {sum = 0;}
            days++;
        }


        if (sum >= 26) {
            sum -= 26;
        }else {sum = 0;}
        System.out.printf("%d%n%d",days,sum);
    }
}
