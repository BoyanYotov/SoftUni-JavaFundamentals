package FinalExamPrep_11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam_EncryptingPassword_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String password = scanner.nextLine();

            String regex = "([\\w\\W^\\s]+)[>](?<group1>\\d{3})[|](?<group2>[a-z]{3})[|](?<group3>[A-Z]{3})[|](?<group4>[\\w\\W^\\s]{3})[<]\\1$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()){
                StringBuilder encryptedPassword = new StringBuilder();
                encryptedPassword.append(matcher.group("group1")).append(matcher.group("group2")).append(matcher.group("group3")).append(matcher.group("group4"));
                System.out.printf("Password: %s\n",encryptedPassword);
            } else {
                System.out.println("Try another password!");
            }


        }
    }
}
