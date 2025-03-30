package FinalExamPrep_11;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String command = input.split(":\\|:")[0];
            String message = concealedMessage.toString();

            if (command.contains("InsertSpace")) {
                int index = Integer.parseInt(input.split(":\\|:")[1]);
                concealedMessage.insert(index, " ");
                System.out.println(concealedMessage);

            } else if (command.contains("Reverse")) {
                String substring = input.split(":\\|:")[1];


                if (message.contains(substring)) {
                    StringBuilder newSubstring = new StringBuilder(substring);
                    newSubstring = newSubstring.reverse();
                    message = message.replace(substring, newSubstring);
                    StringBuilder newMessage = new StringBuilder(message);
                    concealedMessage = newMessage;
                    System.out.println(concealedMessage);
                } else {
                    System.out.println("error");
                }

            } else if (command.contains("ChangeAll")) {
                String substring = input.split(":\\|:")[1];
                String replacement = input.split(":\\|:")[2];

                message = message.replaceAll(substring, replacement);
                StringBuilder newMessage = new StringBuilder(message);
                concealedMessage = newMessage;
                System.out.println(concealedMessage);
            }

            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + concealedMessage);
    }
}
