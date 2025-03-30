package FinalExamPrep_11;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            if (command.contains("Take")) {
                String newPass = "";
                for (int i = 0; i <= password.length() - 1; i++) {
                    if (i % 2 != 0) {
                        newPass += password.charAt(i);
                    }
                }
                System.out.println(newPass);
                password = newPass;

            } else if (command.contains("Cut")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);
                String substring = password.substring(index, index + length);
                password = password.replaceFirst(substring, "");
                System.out.println(password);

            } else if (command.contains("Substitute")) {
                String substring = command.split(" ")[1];
                String substitute = command.split(" ")[2];
                if (password.contains(substring)) {
                    password = password.replace(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Your password is: %s\n", password);
    }
}
