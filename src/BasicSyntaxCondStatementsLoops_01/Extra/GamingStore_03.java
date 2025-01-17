package BasicSyntaxCondStatementsLoops_01.Extra;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double gamePrice = 0;
        double totalSpent = 0;
        String input = scanner.nextLine();

        while (!input.equals("Game Time")){

            switch (input){
                case "OutFall 4":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }

            if (gamePrice > currentBalance){
                System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
            }

            currentBalance -= gamePrice;
            totalSpent += gamePrice;
            System.out.printf("Bought %s%n",input);

            if (currentBalance == 0) {
                System.out.print("Out of money!");
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpent,currentBalance);

    }
}
