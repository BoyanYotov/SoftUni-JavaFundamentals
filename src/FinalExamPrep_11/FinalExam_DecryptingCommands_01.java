package FinalExamPrep_11;

import java.util.Scanner;

public class FinalExam_DecryptingCommands_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            String command = input.split("\\s+")[0];

            if (command.equals("Replace")) {
                String oldChar = input.split("\\s+")[1];
                String newChar = input.split("\\s+")[2];

                message = new StringBuilder(message.toString().replace(oldChar, newChar));
                System.out.println(message);

            } else if (command.equals("Cut")) {
                int startIndex = Integer.parseInt(input.split("\\s+")[1]);
                int endIndex = Integer.parseInt(input.split("\\s+")[2]);

                if (startIndex >= 0 && startIndex <= message.length() && endIndex >= 0 && endIndex <= message.length()) {
                    message.delete(startIndex, endIndex + 1);
                    System.out.println(message);

                } else {
                    System.out.println("Invalid indices!");
                    input = scanner.nextLine();
                    continue;
                }

            } else if (command.equals("Make")) {
                String position = input.split("\\s+")[1];
                if (position.equals("Upper")) {
                    message = new StringBuilder(message.toString().toUpperCase());
                    System.out.println(message);
                } else if (position.equals("Lower")) {
                    message = new StringBuilder(message.toString().toLowerCase());
                    System.out.println(message);
                }

            } else if (command.equals("Check")) {
                String text = input.split("\\s+")[1];
                if (message.toString().contains(text)) {
                    System.out.printf("Message contains %s\n", text);
                } else {
                    System.out.printf("Message doesn't contain %s\n", text);
                }

            } else if (command.equals("Sum")) {
                int startIndex = Integer.parseInt(input.split("\\s+")[1]);
                int endIndex = Integer.parseInt(input.split("\\s+")[2]);

                if (startIndex >= 0 && startIndex <= message.length() && endIndex >= 0 && endIndex <= message.length()) {
                    String substring = message.substring(startIndex, endIndex + 1);

                    int sum = 0;
                    for (int i = 0; i <= substring.length() - 1; i++) {
                        char symbol = substring.charAt(i);
                        sum += symbol;
                    }
                    System.out.println(sum);

                } else {
                    System.out.println("Invalid indices!");
                    input = scanner.nextLine();
                    continue;
                }
            }


            input = scanner.nextLine();
        }
    }
}
