package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double grandTotal = 0;

        for (int i = 1; i <= n ; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double total = ((days*capsuleCount) * pricePerCapsule);
            grandTotal += total;

            System.out.printf("The price for the coffee is: $%.2f",total);
            System.out.println();
        }
        System.out.printf("Total: $%.2f",grandTotal);
    }
}
