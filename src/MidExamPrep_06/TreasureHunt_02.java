package MidExamPrep_06;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> loots = Arrays.stream(scanner.nextLine()
                            .split("\\|"))
                            .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")){
            List<String> parts = new ArrayList<>(Arrays.asList(command.split(" ")));

            if (command.contains("Loot")){
                for (int j = 1; j < parts.size(); j++) {
                        if (!loots.contains(parts.get(j))) {
                            loots.add(0, parts.get(j));
                        }
                    }

            } else if (command.contains("Drop")){
                int index = Integer.parseInt(parts.get(1));

                if (index >= 0 && index <= loots.size()-1) {
                    String item = loots.get(index);
                    loots.remove(index);
                    loots.add(item);
                }

            } else if (command.contains("Steal")) {
                int count = Integer.parseInt(parts.get(1));
                List<String> stolenItems = new ArrayList<>();

                for (int i = 0; i < count && !loots.isEmpty(); i++) {
                        String item = loots.get(loots.size() - 1);
                        stolenItems.add(item);
                        loots.remove(loots.size() - 1);
                    }

                    Collections.reverse(stolenItems);
                    System.out.println(String.join(", ", stolenItems));
                }

            command = scanner.nextLine();
        }

        if (loots.isEmpty()){
            System.out.println("Failed treasure hunt.");
        } else {
            int totalLength = loots.stream().mapToInt(String::length).sum();
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", (double) totalLength/loots.size());

        }
    }
}
