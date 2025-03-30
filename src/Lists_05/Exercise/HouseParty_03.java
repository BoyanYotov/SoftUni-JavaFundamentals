package Lists_05.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            String guestName = command.split(" ")[0];

            if (command.contains("not")) {
                if (guests.contains(guestName)) {
                    guests.remove(guestName);
                } else {
                    System.out.printf("%s is not in the list!%n", guestName);
                }
            } else {
                if (guests.contains(guestName)) {
                    System.out.printf("%s is already in the list!%n", guestName);
                } else
                    guests.add(guestName);
            }
        }

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
