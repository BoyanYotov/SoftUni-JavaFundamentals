package Methods_04.Lab;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printFirstPart(n);
        printSecondPart(n);
    }

    private static void printFirstPart(int n){
        for (int i = 1; i <= n ; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    private static void printSecondPart(int n){
        for (int i = n - 1; i >= 1 ; i--) {

            for (int j = 0; j < i ; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
