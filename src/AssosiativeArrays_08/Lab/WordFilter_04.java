package AssosiativeArrays_08.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .filter(word -> word.length() % 2 == 0)
                .toArray(String[]::new);

        for (String product : products) {
            System.out.println(product);
        }


    }
}
