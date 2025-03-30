package Lists_05.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(" ")).map(Integer::parseInt)
                                .collect(Collectors.toList());

        int iteration = numbers.size()/2;

        for (int i = 0; i < iteration ; i++) {
            int summedNumber = numbers.get(i) + numbers.getLast();
            numbers.removeLast();
            numbers.set(i,summedNumber);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
