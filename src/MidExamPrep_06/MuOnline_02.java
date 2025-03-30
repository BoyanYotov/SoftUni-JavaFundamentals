package MidExamPrep_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHealth = 100;
        int initialBitcoins = 0;
        int currentHealth = initialHealth;
        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int roomCount = 0;
        for (int i = 0; i <= rooms.size() - 1; i++) {
            String room = rooms.get(i);
            roomCount++;

            if (room.contains("potion")) {
                int heal = Integer.parseInt(room.split(" ")[1]);

                if (currentHealth + heal > 100) {
                    heal = 100 - currentHealth;
                    currentHealth = 100;
                } else {
                    currentHealth += heal;
                }
                System.out.printf("You healed for %d hp.%n", heal);
                System.out.printf("Current health: %d hp.%n", currentHealth);

            } else if (room.contains("chest")) {
                int reward = Integer.parseInt(room.split(" ")[1]);
                System.out.printf("You found %d bitcoins.%n", reward);
                initialBitcoins += reward;

            } else {
                String monster = room.split(" ")[0];
                int attack = Integer.parseInt(room.split(" ")[1]);
                currentHealth -= attack;

                if (currentHealth > 0) {
                    System.out.printf("You slayed %s.%n", monster);
                } else {
                    System.out.printf("You died! Killed by %s.%n", monster);
                    System.out.printf("Best room: %d", roomCount);
                    return;
                }
            }

            if (currentHealth > 0 && roomCount == rooms.size()) {
                System.out.println("You've made it!");
                System.out.printf("Bitcoins: %d%n", initialBitcoins);
                System.out.printf("Health: %d%n", currentHealth);
            }
        }
    }
}
