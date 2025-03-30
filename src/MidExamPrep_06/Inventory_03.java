package MidExamPrep_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split(", ")).toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            if (command.contains("Collect")) {
                String item = command.split(" - ")[1];

                if (!items.contains(item)) {
                    items.add(item);
                }

            } else if (command.contains("Drop")) {
                String item = command.split(" - ")[1];

                items.remove(item);

            } else if (command.contains("Combine")) {
                String oldItem = command.split(" - ")[1].split(":")[0];
                String newItem = command.split(" - ")[1].split(":")[1];

                if (items.contains(oldItem)) {
                    int indexOldItem = items.indexOf(oldItem);
                    items.add(indexOldItem + 1, newItem);
                }

            } else if (command.contains("Renew")) {
                String item = command.split(" - ")[1];

                if (items.contains(item)) {
                    items.remove(item);
                    items.add(item);
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i <= items.size() - 1; i++) {
            String itemToPrint = items.get(i);
            if (i == items.size() - 1) {
                System.out.print(itemToPrint);
            } else {
                System.out.print(itemToPrint + ", ");
            }
        }
    }
}
