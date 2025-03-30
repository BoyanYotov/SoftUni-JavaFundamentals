package AssosiativeArrays_08.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> farming = new LinkedHashMap<>();
        farming.put("shards", 0);
        farming.put("fragments", 0);
        farming.put("motes", 0);

        boolean isObtained = false;
        String obtainedItem = "";

        while (!isObtained) {
            String input = scanner.nextLine();
            String[] materials = input.toLowerCase().split(" ");

            for (int i = 0; i < materials.length - 1; i += 2) {
                int quantity = Integer.parseInt(materials[i]);
                String material = materials[i + 1];

                if (farming.containsKey(material)) {
                    int currentQuantity = farming.get(material);
                    farming.put(material, quantity + currentQuantity);
                } else {
                    farming.put(material, quantity);
                }

                int totalQuantity = farming.get(material);

                if (totalQuantity >= 250) {

                    if (material.equals("shards")) {
                        isObtained = true;
                        obtainedItem = "Shadowmourne";
                    } else if (material.equals("fragments")) {
                        isObtained = true;
                        obtainedItem = "Valanyr";
                    } else if (material.equals("motes")) {
                        isObtained = true;
                        obtainedItem = "Dragonwrath";
                    }
                }

                if (isObtained) {
                    farming.put(material, totalQuantity - 250);
                    break;
                }
            }

        }
        System.out.printf("%s obtained!%n", obtainedItem);

        for (Map.Entry<String, Integer> entry : farming.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}