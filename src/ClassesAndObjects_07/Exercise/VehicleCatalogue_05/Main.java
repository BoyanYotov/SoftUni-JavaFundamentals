package ClassesAndObjects_07.Exercise.VehicleCatalogue_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Vehicle> allCars = new ArrayList<>();

        while (!command.equals("End")) {
            String[] data = command.split(" ");
            String type = data[0];
            String model = data[1];
            String colour = data[2];
            int horsePower = Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(type, model, colour, horsePower);
            allCars.add(vehicle);

            command = scanner.nextLine();
        }

        String models = scanner.nextLine();

        while (!models.equals("Close the Catalogue")) {

            for (int i = 0; i <= allCars.size() - 1; i++) {
                if (allCars.get(i).getModel().equals(models)) {
                    System.out.printf("Type: %s%n", allCars.get(i).getType());
                    System.out.printf("Model: %s%n", allCars.get(i).getModel());
                    System.out.printf("Color: %s%n", allCars.get(i).getColour());
                    System.out.printf("Horsepower: %d%n", allCars.get(i).getHorsePower());
                }
            }

            models = scanner.nextLine();
        }

        double averageHPCars = getAverageHPCars (allCars,"Car");
        double averageHPTrucks = getAverageHPTrucks (allCars,"Truck");


        System.out.printf("Cars have average horsepower of: %.2f%n",averageHPCars);
        System.out.printf("Trucks have average horsepower of: %.2f%n",averageHPTrucks);
    }

    private static double getAverageHPTrucks(List<Vehicle> allCars, String type) {
        int count = 0;
        double totalPowers = 0;
        for (Vehicle allCar : allCars) {
            if (allCar.getType().equals(type)) {
                count++;
                totalPowers += allCar.getHorsePower();
            }
        }
        if (totalPowers == 0 || count == 0) {
            return 0;
        } else {
            return totalPowers / count;
        }
    }

    private static double getAverageHPCars(List<Vehicle> allCars, String type) {
        int count = 0;
        double totalPowers = 0;
        for (Vehicle allCar : allCars) {
            if (allCar.getType().equals(type)){
                count++;
                totalPowers += allCar.getHorsePower();
            }

        } if (totalPowers == 0 || count == 0) {
            return 0;
        } else {
            return totalPowers / count;
        }
    }
}
