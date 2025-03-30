package FinalExamPrep_11;

import java.util.Scanner;

public class Registration_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder usernameSB = new StringBuilder(scanner.nextLine());
        String newUsernameString = usernameSB.toString();
        String command = scanner.nextLine();

        while (!command.equals("Registration")) {

            if (command.contains("Letters")) {
                String position = command.split("\\s+")[1];

                if (position.equals("Lower")) {
                    newUsernameString = newUsernameString.toLowerCase();
                    System.out.println(newUsernameString);
                } else if (position.equals("Upper")) {
                    newUsernameString = newUsernameString.toUpperCase();
                    System.out.println(newUsernameString);
                }
                usernameSB = new StringBuilder(newUsernameString);

            } else if (command.contains("Reverse")) {
                int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                int endIndex = Integer.parseInt(command.split("\\s+")[2]);

                if (startIndex >= 0 && startIndex <= usernameSB.length() - 2  && endIndex >= 0 && endIndex <= usernameSB.length() - 1) {
                    StringBuilder substring = new StringBuilder(usernameSB.substring(startIndex, endIndex + 1));
                    System.out.println(substring.reverse());
                } else {
                    command = scanner.nextLine();
                    continue;
                }

            } else if (command.contains("Substring")) {
                String substring = command.split(" ")[1];

                if (newUsernameString.contains(substring)) {
                    newUsernameString = newUsernameString.replace(substring, "");
                    System.out.println(newUsernameString);
                } else {
                    System.out.printf("The username %s doesn't contain %s.\n", newUsernameString, substring);
                }
                usernameSB = new StringBuilder(newUsernameString);

            } else if (command.contains("Replace")) {
                String symbol = command.split(" ")[1];

                newUsernameString = newUsernameString.replaceAll(symbol, "-");
                System.out.println(newUsernameString);

                usernameSB = new StringBuilder(newUsernameString);

            } else if (command.contains("IsValid")) {
                String symbol = command.split(" ")[1];

                if (newUsernameString.contains(symbol)) {
                    System.out.println("Valid username.");
                } else {
                    System.out.printf("%s must be contained in your username.\n", symbol);
                }
            }

            command = scanner.nextLine();
        }

    }
}
