package Methods_04.Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());
        String formattedInput = repeatedText(input,repetitions);
        System.out.println(formattedInput);
    }

    private static String repeatedText(String input, int n){
        String repeatedText = "";
        for (int i = 1; i <= n ; i++) {
            repeatedText += input;
        }
        return repeatedText;
    }
}
