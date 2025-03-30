package TextProcessing_09.Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordPiece = scanner.nextLine();
        String word = scanner.nextLine();

        while (word.contains(wordPiece)) {
            word = word.replace(wordPiece, "");
        }

        System.out.println(word);
    }
}
