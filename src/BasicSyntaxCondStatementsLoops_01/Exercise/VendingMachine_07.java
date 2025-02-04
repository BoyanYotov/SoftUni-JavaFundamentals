package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.nio.DoubleBuffer;
import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 ||
            coin == 1.0 || coin == 2.0){
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n",coin);
            }

            input = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!product.equals("End")){
            double productPrice = 0;

            if (product.equals("Nuts")){
                productPrice = 2.0;
            } else if (product.equals("Water")){
                productPrice = 0.7;
            } else if (product.equals("Crisps")){
                productPrice = 1.5;
            } else if (product.equals("Soda")){
                productPrice = 0.8;
            } else if (product.equals("Coke")){
                productPrice = 1.0;
            } else {
                System.out.println("Invalid product");
                product = scanner.nextLine();
                continue;
            }

            if (sum >= productPrice) {
                    System.out.printf("Purchased %s%n", product);
                    sum -= productPrice;
            } else {
                    System.out.println("Sorry, not enough money");
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f",sum);
    }
}
