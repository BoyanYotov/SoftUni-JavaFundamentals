package FinalExamPrep_11;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRatings = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);
            plantsRarity.put(plant, rarity);

            plantsRatings.putIfAbsent(plant, new ArrayList<>());
        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")) {
            String plant = command.split(" ")[1];

            if (!plantsRarity.containsKey(plant)) {
                System.out.println("error");
                command = scanner.nextLine();
                continue;
            }

            if (command.contains("Rate")) {
                double rating = Double.parseDouble(command.split(" ")[3]);
                plantsRatings.get(plant).add(rating);

            } else if (command.contains("Update")) {
                int newRarity = Integer.parseInt(command.split(" ")[3]);
                plantsRarity.put(plant, newRarity);

            } else if (command.contains("Reset")) {
                plantsRatings.get(plant).clear();
            }

            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> entry : plantsRarity.entrySet()) {
            String plant = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = plantsRatings.get(plant).stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", plant, rarity, averageRating);
        }
    }
}
