package MidExamPrep_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Shopping_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split("!")).toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            if (command.contains("Urgent")) {
                String item = command.split(" ")[1];

                if (products.contains(item)) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    products.addFirst(item);
                }

            } else if (command.contains("Unnecessary")) {
                String item = command.split(" ")[1];
                if (!products.contains(item)) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    products.remove(item);
                }
            } else if (command.contains("Correct")) {
                String oldItem = command.split(" ")[1];
                String newItem = command.split(" ")[2];
                if (!products.contains(oldItem)) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    products.set(products.indexOf(oldItem), newItem);
                }

            } else if (command.contains("Rearrange")) {
                String item = command.split(" ")[1];
                if (!products.contains(item)) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    products.remove(products.indexOf(item));
                    products.add(item);
                }

            }


            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", products));
    }
}
