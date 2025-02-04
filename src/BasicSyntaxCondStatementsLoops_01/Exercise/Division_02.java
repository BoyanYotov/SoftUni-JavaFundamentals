package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int maxDivisionNumber = 0;

        boolean isDivisible = false;
        
        if (number % 2 == 0){
            maxDivisionNumber = 2;
            isDivisible = true;
        }

        if (number % 3 == 0) {
            maxDivisionNumber = 3;
            isDivisible = true;
        }

        if (number % 6 == 0 ){
            maxDivisionNumber = 6;
            isDivisible = true;
        }

        if (number % 7 == 0){
            maxDivisionNumber = 7;
            isDivisible = true;
        }

        if (number % 10 == 0){
            maxDivisionNumber = 10;
            isDivisible = true;
        }

        if (isDivisible){
        System.out.printf("The number is divisible by %d",maxDivisionNumber);
        } else {
            System.out.println("Not divisible");
        }
    }
}
