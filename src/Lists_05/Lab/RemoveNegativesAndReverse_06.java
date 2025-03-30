package Lists_05.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();

        for (int i = 0; i <= numbers.size() - 1; i++) {
            int number = numbers.get(i);
            if (number >= 0) {
                positiveNumbers.add(number);
            }
        }

        Collections.reverse(positiveNumbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            for (Integer number : positiveNumbers) {
                System.out.print(number + " ");
            }
        }
    }
}
