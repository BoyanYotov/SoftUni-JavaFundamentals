package MidExamPrep_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int movesCount = 0;

        while (!command.equals("end")) {
            movesCount++;


            int index1 = Integer.parseInt(command.split(" ")[0]);
            int index2 = Integer.parseInt(command.split(" ")[1]);

            if ((index1 == index2) || (index1 < 0) || (index2 < 0) || (index1 > numbers.size() - 1) || (index2 > numbers.size() - 1)) {
                System.out.println("Invalid input! Adding additional elements to the board");

                int indexToReplace = numbers.size() / 2;
                numbers.add(indexToReplace, "-" + movesCount + "a");
                numbers.add(indexToReplace, "-" + movesCount + "a");

                command = scanner.nextLine();
                continue;
            }

            String firstNumber = numbers.get(index1);
            String secondNumber = numbers.get(index2);


            if (firstNumber.equals(secondNumber)) {
                numbers.remove(firstNumber);
                numbers.remove(secondNumber);

                System.out.printf("Congrats! You have found matching elements - %s!%n", firstNumber);
            } else {
                System.out.println("Try again!");
            }

            if (numbers.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", movesCount);
                return;
            }

            command = scanner.nextLine();
        }

        if (!numbers.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.println(numbers.toString().replace("[", "").replace("]", "").replaceAll(", ", " "));
        }

    }
}
