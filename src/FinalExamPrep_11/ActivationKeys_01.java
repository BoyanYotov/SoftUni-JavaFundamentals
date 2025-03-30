package FinalExamPrep_11;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {

            if (command.contains("Contains")) {
                String substring = command.split(">>>")[1];
                if (input.contains(substring)) {
                    System.out.printf("%s contains %s\n", input, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command.contains("Flip")) {
                String position = command.split(">>>")[1];
                int startIndex = Integer.parseInt(command.split(">>>")[2]);
                int endIndex = Integer.parseInt(command.split(">>>")[3]);
                String substring = input.substring(startIndex, endIndex);

                if (position.equals("Upper")) {
                    String newSubstring = substring.toUpperCase();
                    input = input.replace(substring, newSubstring);
                    System.out.println(input);
                } else if (position.equals("Lower")) {
                    String newSubstring = substring.toLowerCase();
                    input = input.replace(substring, newSubstring);
                    System.out.println(input);
                }

            } else if (command.contains("Slice")) {
                int startIndex = Integer.parseInt(command.split(">>>")[1]);
                int endIndex = Integer.parseInt(command.split(">>>")[2]);
                String substring = input.substring(startIndex, endIndex);
                input = input.replace(substring, "");
                System.out.println(input);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", input);
    }
}
