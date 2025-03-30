package Lists_05.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(" ")).map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("RemoveAt")) {
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(indexToRemove);
            } else if (command.contains("Remove")) {
                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(numberToRemove));
            } else if (command.contains("Insert")){
                int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                numbers.add(indexToInsert,numberToInsert);
            }
            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
