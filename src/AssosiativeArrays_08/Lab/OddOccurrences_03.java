package AssosiativeArrays_08.Lab;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> repetitions = new LinkedHashMap<>();

        for (String word : words) {
            word = word.toLowerCase();

            if (!repetitions.containsKey(word)) {
                repetitions.put(word, 1);
            } else {
                int times = repetitions.get(word);
                repetitions.put(word, times + 1);
            }

        }
        List<String> results = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : repetitions.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                results.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", results));
    }
}
