package BasicSyntaxCondStatementsLoops_01.Extra;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        double totalSpent = 0;

        while (!command.equals("Game Time")){
            double gamePrice = 0;

            switch (command){
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
                    command = scanner.nextLine();
                    continue;
            }

            if (gamePrice > currentBalance){
                System.out.println("Too Expensive");
                command = scanner.nextLine();
                continue;
            }

            System.out.printf("Bought %s%n",command);
            currentBalance -= gamePrice;
            totalSpent += gamePrice;

            if (currentBalance <= 0){
                System.out.println("Out of money!");
                return;
            }

            command = scanner.nextLine();

        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpent,currentBalance);
    }
}
