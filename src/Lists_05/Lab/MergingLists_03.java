package Lists_05.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine()
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> combinedList = new ArrayList<>();

        int minLength = Math.min(firstList.size(),secondList.size());

        for (int i = 0; i < minLength; i++) {
            int firstNumber = firstList.get(i);
            int secondNumber = secondList.get(i);

            combinedList.add(firstNumber);
            combinedList.add(secondNumber);
        }

        if (firstList.size() > secondList.size()){
            List<Integer> extraNumbers = firstList.subList(minLength,firstList.size());
            combinedList.addAll(extraNumbers);
        } else {
            List<Integer> extraNumbers = secondList.subList(minLength,secondList.size());
            combinedList.addAll(extraNumbers);
        }

        for (Integer i : combinedList) {
            System.out.print(i+" ");
        }
    }
}
