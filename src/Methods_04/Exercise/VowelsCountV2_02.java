package Methods_04.Exercise;

import java.util.Scanner;

public class VowelsCountV2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine().toLowerCase();
        int vowelsCount = getVowelsCount(password);
        System.out.println(vowelsCount);
    }

    private static int getVowelsCount(String pass) {
        int count = 0;

        for (char symbol : pass.toCharArray()) {
            if (symbol == 'a' || symbol == 'o' || symbol == 'i' || symbol == 'e' || symbol == 'u') {
                count++;
            }
        }
        return count;
    }

}