package FinalExamPrep_11;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String direction = command.split(":")[0];
            switch (direction) {
                case "Add Stop":
                    int indexToInsert = Integer.parseInt(command.split(":")[1]);
                    String substring = command.split(":")[2];

                    if (indexToInsert >= 0 && indexToInsert <= input.length() - 1) {
                        input.insert(indexToInsert, substring);
                    }
                    System.out.println(input);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(command.split(":")[1]);
                    int endIndex = Integer.parseInt(command.split(":")[2]);

                    if ((startIndex >= 0 && startIndex <= input.length() - 1) && (endIndex >= 0 && endIndex <= input.length() - 1)) {
                        input.replace(startIndex, endIndex + 1, "");
                    }
                    System.out.println(input);
                    break;
                case "Switch":
                    String oldString = command.split(":")[1];
                    String newString = command.split(":")[2];
                    String tour = input.toString();
                    if (tour.contains(oldString)) {
                        tour = tour.replaceAll(oldString, newString);
                    }
                    input = input.delete(0, input.length());
                    input.append(tour);
                    System.out.println(input);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + input);
    }
}
