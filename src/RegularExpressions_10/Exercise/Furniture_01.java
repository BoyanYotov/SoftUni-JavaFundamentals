package RegularExpressions_10.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<furnitureName>\\w+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);
        double totalSpend = 0;

        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furniture = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                System.out.println(furniture);
                totalSpend += price * quantity;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", totalSpend);
    }
}
