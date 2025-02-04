package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = "";
//        char letter = 0;
        int length = username.length();

        for (int i = length - 1 ; i >= 0 ; i--) {
            char letter = username.charAt(i);
            correctPassword += letter;
        }

        String passwordInput = scanner.nextLine();

        int counter = 1;

        while(!passwordInput.equals(correctPassword)){

            System.out.println("Incorrect password. Try again.");
            passwordInput = scanner.nextLine();
            counter++;

            if (counter >= 4){
                System.out.printf("User %s blocked!",username);
                return;
            }
        }

        System.out.printf("User %s logged in.",username);
    }
}
