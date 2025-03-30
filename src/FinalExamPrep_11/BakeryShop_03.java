package FinalExamPrep_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Integer> stock = new LinkedHashMap<>();
        int totalSold = 0;

        while (!command.equals("Complete")) {
            int quantity = Integer.parseInt(command.split("\\s+")[1]);
            String food = command.split("\\s+")[2];

            if (command.contains("Receive")) {
                if (quantity <= 0) {
                    command = scanner.nextLine();
                    continue;
                }

                if (stock.containsKey(food)) {
                    int currentQuantity = stock.get(food);
                    stock.put(food, currentQuantity + quantity);
                }
                stock.putIfAbsent(food, quantity);

            } else if (command.contains("Sell")) {

                if (!stock.containsKey(food)) {
                    System.out.printf("You do not have any %s.\n", food);
                } else {
                    int currentQuantity = stock.get(food);

                    if (quantity > currentQuantity) {
                        stock.remove(food);
                        System.out.printf("There aren't enough %s. You sold the last %d of them.\n", food, currentQuantity);
                        totalSold += currentQuantity;
                    } else if (quantity == currentQuantity) {
                        System.out.printf("You sold %d %s.\n", quantity, food);
                        totalSold += quantity;
                        stock.remove(food);
                    } else {
                        System.out.printf("You sold %d %s.\n", quantity, food);
                        stock.put(food, currentQuantity - quantity);
                        totalSold += quantity;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
        System.out.printf("All sold: %d goods\n", totalSold);
    }
}
