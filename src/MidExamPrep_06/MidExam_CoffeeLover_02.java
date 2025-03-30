package MidExamPrep_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidExam_CoffeeLover_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffees = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            String command = scanner.nextLine();

            if (command.contains("Include")) {
                String item = command.split(" ")[1];
                coffees.add(item);
            } else if (command.contains("Remove")) {
                String position = command.split(" ")[1];
                int numberOfCoffees = Integer.parseInt(command.split(" ")[2]);
                if (numberOfCoffees > coffees.size()) {
                    continue;
                } else {
                    if (position.equals("first")) {
                        for (int j = 1; j <= numberOfCoffees; j++) {
                            coffees.removeFirst();
                        }
                    } else if (position.equals("last")) {
                        for (int j = 1; j <= numberOfCoffees; j++) {
                            coffees.removeLast();
                        }
                    }
                }
            } else if (command.contains("Prefer")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                if (index1 >= 0 && index2 >= 0 && index1 <= coffees.size() - 1 && index2 <= coffees.size() - 1) {
                    String firstCoffee = coffees.get(index1);
                    String secondCoffee = coffees.get(index2);
                    coffees.set(index1, secondCoffee);
                    coffees.set(index2, firstCoffee);
                }
            } else if (command.contains("Reverse")) {
                Collections.reverse(coffees);
            }

        }
        System.out.println("Coffees:");
        for (String coffee : coffees) {
            System.out.print(coffee + " ");
        }
    }
}