package RegularExpressions_10.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regexUsername = "[A-Za-z0-9]+[._-]?[A-Za-z0-9]+";
        String regexHost = "([A-Za-z0-9]+)[-]?([A-Za-z0-9]+)[.]([A-Za-z0-9]+)[.]?\\w+]?";
        String regex = regexUsername + "@" + regexHost;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
