package Methods_04.Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printOrderTotal(product,quantity);

    }
    public static void printOrderTotal(String item, int qty){
        switch (item){
            case "coffee" -> System.out.printf("%.2f",qty * 1.5);
            case "water" -> System.out.printf("%.2f",qty * 1.00);
            case "coke" -> System.out.printf("%.2f",qty * 1.4);
            case "snacks" -> System.out.printf("%.2f",qty * 2.00);
        }
    }

}
