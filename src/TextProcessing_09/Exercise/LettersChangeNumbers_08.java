package TextProcessing_09.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String code : input) {
            char firstLetter = code.charAt(0);
            char lastLetter = code.charAt(code.length() - 1);
            double number = Double.parseDouble(code.substring(1, code.length() - 1));

            if (Character.isUpperCase(firstLetter)) {
                number = number / (firstLetter - 64);
            } else {
                number = number * (firstLetter - 96);
            }

            if (Character.isUpperCase(lastLetter)) {
                number = number - (lastLetter - 64);
            } else {
                number = number + (lastLetter - 96);
            }

            totalSum += number;
        }

        System.out.printf("%.2f", totalSum);
    }
}
