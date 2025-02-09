package Methods_04.Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean validatePasswordLength = validatePasswordLength(password);
        boolean validateOnlyLettersAndDigits = validateOnlyLettersAndDigits(password);
        boolean validateAtLeast2Digits = validateAtLeast2Digits(password);

        if (!validatePasswordLength){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validateOnlyLettersAndDigits){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!validateAtLeast2Digits){
            System.out.println("Password must have at least 2 digits");
        }

        if (validatePasswordLength && validateAtLeast2Digits && validateOnlyLettersAndDigits){
            System.out.println("Password is valid");
        }
    }

    private static boolean validatePasswordLength(String pass){
        return pass.length() >= 6 && pass.length() <= 10;
    }

    private static boolean validateOnlyLettersAndDigits (String pass){
        for (char symbol : pass.toCharArray()){
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    private static boolean validateAtLeast2Digits (String pass){
        int count = 0;
        for (char symbol : pass.toCharArray()){
            if (Character.isDigit(symbol)){
                count++;
            }
        }
        return count >= 2;
    }
}
