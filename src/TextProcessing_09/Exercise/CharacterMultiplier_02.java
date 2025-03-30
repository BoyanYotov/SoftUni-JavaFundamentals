package TextProcessing_09.Exercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String firstText = input.split("\\s+")[0];
        String secondText = input.split("\\s+")[1];

        int totalSum = calculateSumOfString(firstText, secondText);

        int restOfSum = calculateRestOfSymbols(firstText,secondText);

        System.out.println(totalSum + restOfSum);
    }

    private static int calculateRestOfSymbols(String firstText, String secondText) {
        String restOfSymbols = "";
        int restOfSum = 0;
        int minLength = Math.min(firstText.length(),secondText.length());

        if (firstText.length() > secondText.length()){
            restOfSymbols = firstText.substring(minLength);
        } else {
            restOfSymbols = secondText.substring(minLength);
        }


        for (int i = 0; i <= restOfSymbols.length() - 1 ; i++) {
            char restofSymbol = restOfSymbols.charAt(i);
            restOfSum += restofSymbol;
        }

        return restOfSum;
    }

    private static int calculateSumOfString(String firstText, String secondText) {
        int minLength = Math.min(firstText.length(),secondText.length());
        int totalSum = 0;
        for (int i = 0; i <= minLength - 1  ; i++) {
            char firstSymbol = firstText.charAt(i);
            char secondSymbol = secondText.charAt(i);
            totalSum += firstSymbol * secondSymbol;

        }

        return totalSum;
    }
}
