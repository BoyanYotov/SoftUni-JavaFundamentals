package FinalExamPrep_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carsMileage = new LinkedHashMap<>();
        Map<String, Integer> carsFuel = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String car = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);

            carsMileage.putIfAbsent(car, mileage);
            carsFuel.putIfAbsent(car, fuel);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String car = command.split(" : ")[1];

            if (command.contains("Drive")) {
                int currentFuel = carsFuel.get(car);
                int currentMileage = carsMileage.get(car);

                int distance = Integer.parseInt(command.split(" : ")[2]);
                int fuel = Integer.parseInt(command.split(" : ")[3]);

                if (currentFuel < fuel) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    carsMileage.put(car, currentMileage + distance);
                    carsFuel.put(car, currentFuel - fuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, fuel);
                }

                if (carsMileage.get(car) >= 100000) {
                    carsFuel.remove(car);
                    carsMileage.remove(car);
                    System.out.printf("Time to sell the %s!\n", car);
                }

            } else if (command.contains("Refuel")) {
                int fuel = Integer.parseInt(command.split(" : ")[2]);

                int currentFuel = carsFuel.get(car);
                int filling = 0;

                if ((currentFuel + fuel) > 75) {
                    filling = 75 - currentFuel;
                    currentFuel = 75;
                } else {
                    currentFuel += fuel;
                    filling = fuel;
                }

                carsFuel.put(car, currentFuel);
                System.out.printf("%s refueled with %d liters\n", car, filling);

            } else if (command.contains("Revert")) {
                int kilometers = Integer.parseInt(command.split(" : ")[2]);

                int currentMileage = carsMileage.get(car);
                currentMileage -= kilometers;
                carsMileage.put(car, currentMileage);

                if (carsMileage.get(car) < 10000) {
                    carsMileage.put(car, 10000);
                } else {
                    carsMileage.put(car, currentMileage);
                    System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);
                }
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : carsFuel.entrySet()) {
            String car = entry.getKey();
            int fuel = entry.getValue();
            int mileage = carsMileage.get(car);

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %s lt.\n", car, mileage, fuel);
        }
    }
}
