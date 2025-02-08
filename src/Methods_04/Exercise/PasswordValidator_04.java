package Methods_04.Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!checkIfPasswordLengthIsValid(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!checkIfPasswordContainsOnlyDigitsAndNumbers(password)){
            System.out.println("Password must consist only of letters and digits");
        }

        if (!checkIfAtLeastTwoDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if (checkIfPasswordContainsOnlyDigitsAndNumbers(password) && checkIfAtLeastTwoDigits(password)
                && checkIfAtLeastTwoDigits(password)){
            System.out.println("Password is valid");
        }
    }

    private static boolean checkIfPasswordLengthIsValid (String text){
        if (text.length() >= 6 && text.length() <= 10){
            return true;
        }
        return false;
    }

    private static boolean checkIfPasswordContainsOnlyDigitsAndNumbers(String text){
        for (char symbol : text.toCharArray()){
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfAtLeastTwoDigits(String text){
        int count = 0;
        for (int i = 0; i <= text.length() -1 ; i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }

            if (count >= 2){
                return true;
            }
        }
        return false;
    }

}
