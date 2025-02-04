package DataTypesAndVariables_02.Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCharacter = Integer.parseInt(scanner.nextLine());
        int endCharacter = Integer.parseInt(scanner.nextLine());

        for (int i = startCharacter; i <= endCharacter ; i++) {
            char symbol = (char) i;

            System.out.print(symbol + " ");
        }
    }
}
