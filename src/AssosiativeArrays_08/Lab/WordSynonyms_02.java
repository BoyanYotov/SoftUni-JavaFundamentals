package AssosiativeArrays_08.Lab;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> dictionary = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            dictionary.putIfAbsent(word, new ArrayList<>());

            dictionary.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }


    }
}
