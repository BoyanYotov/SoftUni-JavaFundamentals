package RegularExpressions_10.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<productQuantity>\\d+)\\|[^|$%.0-9]*(?<productPrice>[0-9]+.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalIncome = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customerName = matcher.group("name");
                String productName = matcher.group("product");
                double productPrice = Double.parseDouble(matcher.group("productPrice"));
                int productQuantity = Integer.parseInt(matcher.group("productQuantity"));

                System.out.printf("%s: %s - %.2f\n", customerName, productName, productPrice * productQuantity);
                totalIncome += productPrice * productQuantity;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f",totalIncome);
    }
}
