package Methods_04.Exercise;

import java.util.Scanner;

public class CharacterInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printAllCharactersInRange(firstSymbol, secondSymbol);

    }

    private static void printAllCharactersInRange(char a, char b) {
        if (a < b) {
            for (int i = (int) a + 1; i < (int) b; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = (int) b + 1; i < (int) a; i++) {
                System.out.print((char) i + " ");
            }
        }
    }

}
