package Lists_05.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsAdvanced_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(" ")).map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Contains")) {
                int numberToCheck = Integer.parseInt(command.split(" ")[1]);
                printIfContainsOrNot(numbers,numberToCheck);

            } else if (command.contains("even")) {
                printEvenNumbers(numbers);

            } else if (command.contains("odd")) {
                printOddNumbers(numbers);

            } else if (command.contains("sum")) {
                int sumOfList = printSumOfNumbers(numbers);
                System.out.println(sumOfList);

            } else if (command.contains("Filter")) {
                String condition = command.split(" ")[1];
                int numberToFilter = Integer.parseInt(command.split(" ")[2]);
                printFilteredList(numbers,condition,numberToFilter);

            }
            command = scanner.nextLine();
        }

    }

        private static void printEvenNumbers (List < Integer > numbers) {
            for (int i = 0; i <= numbers.size() - 1; i++) {
                int number = numbers.get(i);
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }

        private static void printOddNumbers (List < Integer > numbers) {
            for (int i = 0; i <= numbers.size() - 1; i++) {
                int number = numbers.get(i);
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }

        private static int printSumOfNumbers (List < Integer > numbers) {
            int sum = 0;
            for (int i = 0; i <= numbers.size() - 1; i++) {
                int number = numbers.get(i);
                sum += number;
            }
            return sum;
        }

        private static void printIfContainsOrNot (List<Integer> numbers, int number){
            if (numbers.contains(number)) {
                System.out.println("Yes");
            } else {
                System.out.println("No such number");
            }
        }

        private static void printFilteredList (List<Integer> numbers, String condition, int number){

            switch (condition) {
                case "<" -> {
                    List<Integer> newList = new ArrayList<>();
                    for (int i = 0; i <= numbers.size()-1 ; i++) {
                        int digit = numbers.get(i);
                        if (digit < number){
                            newList.add(digit);
                        }
                    }
                    for (Integer digit : newList) {
                        System.out.print(digit + " ");
                    }
                    System.out.println();
                }
                case ">" -> {
                    List<Integer> newList = new ArrayList<>();
                    for (int i = 0; i <= numbers.size()-1 ; i++) {
                        int digit = numbers.get(i);
                        if (digit > number){
                            newList.add(digit);
                        }
                    }
                    for (Integer digit : newList) {
                        System.out.print(digit + " ");
                    }
                    System.out.println();
                }
                case "<=" -> {
                    List<Integer> newList = new ArrayList<>();
                    for (int i = 0; i <= numbers.size()-1 ; i++) {
                        int digit = numbers.get(i);
                        if (digit <= number){
                            newList.add(digit);
                        }
                    }
                    for (Integer digit : newList) {
                        System.out.print(digit + " ");
                    }
                    System.out.println();
                }
                case ">=" -> {
                    List<Integer> newList = new ArrayList<>();
                    for (int i = 0; i <= numbers.size()-1 ; i++) {
                        int digit = numbers.get(i);
                        if (digit >= number){
                            newList.add(digit);
                        }
                    }
                    for (Integer digit : newList) {
                        System.out.print(digit + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

