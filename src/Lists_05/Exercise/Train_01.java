package Lists_05.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                                .split(" ")).map(Integer::parseInt)
                                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Add")){
                int wagonToAdd = Integer.parseInt(command.split(" ")[1]);
                wagons.add(wagonToAdd);
            } else {
                int passengersToAdd = Integer.parseInt(command.split(" ")[0]);
                    for (int i = 0; i < wagons.size() ; i++) {
                        if (wagons.get(i) + passengersToAdd <= maxCapacity) {
                        wagons.set(i,wagons.get(i) + passengersToAdd);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
