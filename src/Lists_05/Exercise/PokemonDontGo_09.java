package Lists_05.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(" ")).map(Integer::parseInt)
                                .collect(Collectors.toList());

        int removedItemsSum = 0;

        while (!numbers.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int numberToIncrease = numbers.getFirst();
                numbers.removeFirst();
                removedItemsSum += numberToIncrease;
                int lastElement = numbers.getLast();
                numbers.addFirst(lastElement);

                modifyTheList(numbers,numberToIncrease);

            } else if (index > numbers.size() - 1) {
                int numberToDecrease = numbers.getLast();
                numbers.removeLast();
                removedItemsSum += numberToDecrease;
                int firstElement = numbers.getFirst();
                numbers.add(firstElement);

                modifyTheList(numbers,numberToDecrease);

            } else {
                int currentNumber = numbers.get(index);
                numbers.remove(index);
                removedItemsSum += currentNumber;

                modifyTheList(numbers,currentNumber);
            }
        }
        System.out.println(removedItemsSum);

    }

    private static void modifyTheList (List<Integer> numbers, int numberToIncrease){
        for (int i = 0; i <= numbers.size()-1 ; i++) {
            int number = numbers.get(i);
            if (number <= numberToIncrease){
                numbers.set(i,number + numberToIncrease);
            } else {
                numbers.set(i,number - numberToIncrease);
            }
        }

    }
}