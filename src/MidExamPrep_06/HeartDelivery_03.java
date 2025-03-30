package MidExamPrep_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> hood = Arrays.stream(scanner.nextLine()
                        .split("@")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int jumpsTotal = 0;
        String command = scanner.nextLine();
        while (!command.equals("Love!")) {
            int length = Integer.parseInt(command.split(" ")[1]);
            jumpsTotal += length;
            if (jumpsTotal > hood.size() - 1) {
                jumpsTotal = 0;
            }

            int house = hood.get(jumpsTotal);
            if (house <= 0) {
                System.out.printf("Place %d already had Valentine's day.%n", jumpsTotal);
                command = scanner.nextLine();
                continue;
            } else {
                hood.set(jumpsTotal, (house -= 2));
            }

            if (house <= 0) {
                System.out.printf("Place %d has Valentine's day.%n", jumpsTotal);
            }

            command = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", jumpsTotal);
        int sum = 0;
        for (Integer i : hood) {
            sum += i;
        }
        if (sum == 0) {
            System.out.println("Mission was successful.");
        } else {
            int countPositive = 0;
            for (Integer i : hood) {
                if (i > 0) {
                    countPositive++;
                }
            }
            System.out.printf("Cupid has failed %d places.", countPositive);
        }
    }
}
