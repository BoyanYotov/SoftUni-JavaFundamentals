package AssosiativeArrays_08.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> productQuantityList = new LinkedHashMap<>();
        Map<String, Double> productPriceList = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (!productQuantityList.containsKey(product)){
                productQuantityList.put(product,quantity);
            } else {
                int currentQuantity = productQuantityList.get(product);
                productQuantityList.put(product, quantity + currentQuantity);
            }

            productPriceList.put(product,price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productQuantityList.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPriceList.get(product);

            System.out.printf("%s -> %.2f%n", product, quantity * price);

        }
    }
}
