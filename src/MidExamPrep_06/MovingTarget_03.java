package MidExamPrep_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.contains("Shoot")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int power = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= targets.size() - 1) {
                    int target = targets.get(index);
                    if (target - power <= 0) {
                        targets.remove(index);
                    } else {
                        targets.set(index, target - power);
                    }
                }
            } else if (command.contains("Add")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int value = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= targets.size() - 1) {
                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                    command = scanner.nextLine();
                    continue;
                }
            } else if (command.contains("Strike")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int radius = Integer.parseInt(command.split(" ")[2]);

                int start = index - radius;
                int end = index + radius;

                if (start < 0 || end > targets.size() - 1) {
                    System.out.println("Strike missed!");
                    command = scanner.nextLine();
                    continue;
                } else {

                    for (int i = end; i >= start; i--) {
                        targets.remove(i);
                    }

                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i <= targets.size() - 1; i++) {
            int numberToPrint = targets.get(i);
            if (i == targets.size() - 1) {
                System.out.print(numberToPrint);
            } else {
                System.out.print(numberToPrint + "|");
            }
        }
    }
}
