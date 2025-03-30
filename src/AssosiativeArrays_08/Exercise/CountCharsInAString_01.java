package AssosiativeArrays_08.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> letterCount = new LinkedHashMap<>();

        for (int i = 0; i <= input.length() - 1; i++) {
            char symbol = input.charAt(i);

            if (symbol == ' ') {
                continue;
            } else {
                if (!letterCount.containsKey(symbol)) {
                    letterCount.put(symbol, 1);
                } else {
                    int currentCount = letterCount.get(symbol);
                    letterCount.put(symbol, currentCount + 1);
                }
            }

        }

        letterCount.entrySet().forEach(a -> System.out.println(a.getKey() + " -> " + a.getValue()));

    }
}
