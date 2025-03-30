package MidExamPrep_06;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = sum * 1.0 / numbers.size();

        List<Integer> greaterThanAverage = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > average) {
                greaterThanAverage.add(number);
            }
        }

        if (greaterThanAverage.isEmpty()) {
            System.out.println("No");
            return;
        }

        Collections.sort(greaterThanAverage);
        Collections.reverse(greaterThanAverage);

        if (greaterThanAverage.size() > 5) {
            List<Integer> topFive = greaterThanAverage.subList(0, 5);

            for (Integer i : topFive) {
                System.out.print(i + " ");
            }
        } else {
            for (Integer i : greaterThanAverage) {
                System.out.print(i + " ");
            }
        }
    }
}