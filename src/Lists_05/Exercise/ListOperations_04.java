package Lists_05.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(" ")).map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);

            } else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int indexToInsert = Integer.parseInt(command.split(" ")[2]);

                if (indexToInsert >= numbers.size() || indexToInsert < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(indexToInsert, numberToInsert);
                }

            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                if (indexToRemove >= numbers.size() || indexToRemove < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(indexToRemove);
                }
            } else if (command.contains("left")) {
                int numberToRotate = Integer.parseInt(command.split(" ")[2]);

                for (int i = 1; i <= numberToRotate ; i++) {
                    int firstNumber = numbers.getFirst();
                    numbers.removeFirst();
                    numbers.add(firstNumber);
                }

            } else if (command.contains("right")){
                int numberToRotate = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= numberToRotate ; i++) {
                    int lastNumber = numbers.getLast();
                    numbers.add(0,lastNumber);
                    numbers.removeLast();
                }
            }

            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
