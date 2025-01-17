package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalCoins = 0;

        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);

            if (coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                totalCoins+=coin;
            } else {
                System.out.printf("Cannot accept %.2f%n",coin);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        double productPrice = 0;

        while (!product.equals("End")){
            boolean isInvalid = false;

            switch (product){
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    isInvalid = true;
                    break;

            }

                if (productPrice>totalCoins){
                    System.out.println("Sorry, not enough money");
                } else {
                    totalCoins -= productPrice;
                    if (!isInvalid) {
                    System.out.printf("Purchased %s%n", product);
                    }
                }

                product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f",totalCoins);

    }
}
