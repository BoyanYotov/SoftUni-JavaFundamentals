package FinalExamPrep_11;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine().toLowerCase();

        while (!input.equals("decode")) {
            String command = input.split("\\|")[0];

            if (command.equals("move")) {
                int numberOfLetters = Integer.parseInt(input.split("\\|")[1]);
                String substring = encryptedMessage.substring(0, numberOfLetters);

                encryptedMessage.append(substring);
                encryptedMessage.delete(0, numberOfLetters);

            } else if (command.equals("insert")) {
                int index = Integer.parseInt(input.split("\\|")[1]);
                String value = input.split("\\|")[2];

                encryptedMessage.insert(index, value);

            } else if (command.equals("changeall")) {
                String substring = input.split("\\|")[1];
                String replacement = input.split("\\|")[2];

                encryptedMessage = new StringBuilder(encryptedMessage.toString().replace(substring, replacement));

            }

            input = scanner.nextLine().toLowerCase();
        }

        System.out.printf("The decrypted message is: %s%n", encryptedMessage);
    }
}