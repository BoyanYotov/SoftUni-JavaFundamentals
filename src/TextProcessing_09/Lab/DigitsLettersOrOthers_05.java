package TextProcessing_09.Lab;

import java.util.Scanner;

public class DigitsLettersOrOthers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] inputArray = input.toCharArray();

        StringBuilder sbForLetters = new StringBuilder();
        StringBuilder sbForDigits = new StringBuilder();
        StringBuilder sbForOthers = new StringBuilder();

        for (char symbol : inputArray) {
            if ((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122)) {
                sbForLetters.append(symbol);
            } else if (symbol >= 48 && symbol <= 57) {
                sbForDigits.append(symbol);
            } else {
                sbForOthers.append(symbol);
            }
        }

        System.out.println(sbForDigits);
        System.out.println(sbForLetters);
        System.out.println(sbForOthers);
    }
}
