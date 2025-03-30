package Lists_05.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(" ")).map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("Delete")){
                int numberToDelete = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(List.of(numberToDelete));
            } else if (command.contains("Insert")){
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                numbers.add(indexToInsert,numberToInsert);
            }

            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
