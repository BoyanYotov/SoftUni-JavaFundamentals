package FinalExamPrep_11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringLine = scanner.nextLine();
        String regex = "(?<symbols>[#\\|])(?<name>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringLine);

        Map<String, String> foodDate = new LinkedHashMap<>();
        Map<String, Integer> foodCalories = new LinkedHashMap<>();
        List<String> items = new LinkedList<>();

        int totalCalories = 0;

        while (matcher.find()) {
            String nameofItem = matcher.group("name");
            String expirationDate = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            foodDate.putIfAbsent(nameofItem, expirationDate);
            foodCalories.putIfAbsent(nameofItem, calories);
            totalCalories += calories;
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", nameofItem, expirationDate, calories));
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);

        items.forEach(System.out::print);
    }
}
