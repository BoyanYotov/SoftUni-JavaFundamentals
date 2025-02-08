package Methods_04.Exercise;

import java.util.Scanner;

public class VowelsCountV1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printVowelsCount(input);

    }

    private static void printVowelsCount(String input){
        int vowelsCount = 0;
        for (int i = 0; i <= input.length() - 1 ; i++) {
            char letter = Character.toLowerCase(input.charAt(i));

            switch (letter){
                case 'a' -> vowelsCount++;
                case 'o' -> vowelsCount++;
                case 'u' -> vowelsCount++;
                case 'e' -> vowelsCount++;
                case 'i' -> vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }

}
