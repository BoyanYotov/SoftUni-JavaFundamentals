package MidExamPrep_06;

import javax.swing.*;
import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalAmount = 0;

        while (!input.contains("special") && (!input.contains("regular"))){
            double price = Double.parseDouble(input);

            if (price > 0) {
                totalAmount += price;
            } else {
                System.out.println("Invalid price!");
            }

            input = scanner.nextLine();
        }

        double taxes = totalAmount * 0.2;
        double grandTotal = totalAmount + taxes;

        if (totalAmount == 0){
            System.out.println("Invalid order!");
            return;
        }

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n",totalAmount);
        System.out.printf("Taxes: %.2f$%n",taxes);
        System.out.println("-----------");

        if (input.equals("special")) {
            double discounted = (totalAmount + taxes) * 0.9;
            System.out.printf("Total price: %.2f$", discounted);
        } else if (input.equals("regular")){
            System.out.printf("Total price: %.2f$",totalAmount+taxes);
        }
    }
}
