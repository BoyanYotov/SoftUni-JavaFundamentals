package Lists_05.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                                    .split(" ")).map(Integer::parseInt)
                                    .collect(Collectors.toList());

        List <Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                                    .split(" ")).map(Integer::parseInt)
                                    .collect(Collectors.toList());

        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            int firstHand = firstPlayer.getFirst();
            int secondHand = secondPlayer.getFirst();

            if (firstHand > secondHand){
                firstPlayer.add(firstHand);
                firstPlayer.add(secondHand);
                firstPlayer.removeFirst();
                secondPlayer.removeFirst();
            } else if (secondHand > firstHand){
                secondPlayer.add(secondHand);
                secondPlayer.add(firstHand);
                firstPlayer.removeFirst();
                secondPlayer.removeFirst();
            } else {
                firstPlayer.removeFirst();
                secondPlayer.removeFirst();
            }

        }

        if (firstPlayer.isEmpty()){
            System.out.printf("Second player wins! Sum: %d ", secondPlayer.stream().mapToInt(Integer::intValue).sum());
        } else {
            System.out.printf("First player wins! Sum: %d ",firstPlayer.stream().mapToInt(Integer::intValue).sum());
        }

    }
}
