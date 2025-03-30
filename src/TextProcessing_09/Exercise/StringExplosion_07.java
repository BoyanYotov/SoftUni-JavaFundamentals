package TextProcessing_09.Exercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        int totalPower = 0;

        for (int i = 0; i <= input.length() - 1; i++) {
            char symbol = input.charAt(i);

            if (symbol == '>') {
                int power = Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                totalPower += power;
            }

            if (totalPower > 0 && symbol != '>') {
                input.deleteCharAt(i);
                totalPower--;
                i--;
            }

        }

        System.out.println(input);

    }
}
