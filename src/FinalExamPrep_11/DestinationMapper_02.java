package FinalExamPrep_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int length = 0;

        while (matcher.find()) {
            destinations.add(matcher.group("destination"));
            length += matcher.group("destination").length();
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + length);

    }
}
