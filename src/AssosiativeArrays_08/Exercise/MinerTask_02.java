package AssosiativeArrays_08.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        Map<String, Integer> collection = new LinkedHashMap<>();

        while (!product.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!collection.containsKey(product)){
                collection.put(product,quantity);
            } else {
                int currentQuantity = collection.get(product);
                collection.put(product, quantity + currentQuantity);
            }

            product = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : collection.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());

        }
    }
}
