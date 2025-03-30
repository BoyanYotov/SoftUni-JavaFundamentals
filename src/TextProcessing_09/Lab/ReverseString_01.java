package TextProcessing_09.Lab;

import java.util.Scanner;

public class ReverseString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String newInput = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                char symbol = input.charAt(i);
                newInput += symbol;
            }

            System.out.println(input + " = " + newInput);

            input = scanner.nextLine();
        }
    }
}
