package AssosiativeArrays_08.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> repetitions = new TreeMap<>();

        for (double number : numbers) {
            if (!repetitions.containsKey(number)) {
                repetitions.put(number, 1);
            } else {
                int occurrences = repetitions.get(number);
                repetitions.put(number, occurrences + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : repetitions.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
