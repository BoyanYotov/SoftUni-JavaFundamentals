package MidExamPrep_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine()
                        .split(">")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine()
                        .split(">")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Retire")) {

            if (command.contains("Fire")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index <= warShip.size() - 1) {
                    int damage = Integer.parseInt(command.split(" ")[2]);
                    int target = warShip.get(index);
                    warShip.set(index, target - damage);

                    if (target - damage <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }

                    for (Integer i : pirateShip) {
                        if (i <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                } else {
                    command = scanner.nextLine();
                    continue;
                }

            } else if (command.contains("Defend")) {
                int start = Integer.parseInt(command.split(" ")[1]);
                int end = Integer.parseInt(command.split(" ")[2]);
                int damage = Integer.parseInt(command.split(" ")[3]);
                if (start >= 0 && end >= 00 && start <= pirateShip.size() - 1 && end <= pirateShip.size() - 1) {
                    for (int i = start; i <= end; i++) {
                        int target = pirateShip.get(i);
                        pirateShip.set(i, target - damage);
                    }
                    for (Integer i : pirateShip) {
                        if (i <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                } else {
                    command = scanner.nextLine();
                    continue;
                }

            } else if (command.contains("Repair")) {
                int index = Integer.parseInt(command.split(" ")[1]);

                if (index >= 0 && index <= pirateShip.size() - 1) {
                    int health = Integer.parseInt(command.split(" ")[2]);
                    int target = pirateShip.get(index);
                    int healedTarget = target + health;
                    if (healedTarget < capacity) {
                        pirateShip.set(index, target + health);
                    } else {
                        pirateShip.set(index, capacity);
                    }
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            } else if (command.contains("Status")) {
                double needsRepair = capacity * 0.2;
                int count = 0;
                for (Integer i : pirateShip) {
                    if (i < needsRepair) {
                        count++;
                    }
                }
                System.out.printf("%d sections need repair.%n", count);
            }
            command = scanner.nextLine();
        }

        int sumPirate = 0;
        for (Integer i : pirateShip) {
            sumPirate += i;
        }

        int sumWar = 0;
        for (Integer i : warShip) {
            sumWar += i;
        }

        System.out.printf("Pirate ship status: %d%n", sumPirate);
        System.out.printf("Warship status: %d", sumWar);
    }
}