package AssosiativeArrays_08.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingRegistration = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.contains("unregister")) {
                String username = command.split(" ")[1];

                if (!parkingRegistration.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    System.out.printf("%s unregistered successfully%n", username);
                    parkingRegistration.remove(username);
                }
            } else if (command.contains("register")) {
                String username = command.split(" ")[1];
                String licencePlate = command.split(" ")[2];

                if (!parkingRegistration.containsKey(username)) {
                    parkingRegistration.put(username, licencePlate);
                    System.out.printf("%s registered %s successfully%n", username, licencePlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licencePlate);
                }
            }
        }

        parkingRegistration.entrySet().forEach(a -> System.out.printf("%s => %s%n", a.getKey(), a.getValue()));
    }
}
