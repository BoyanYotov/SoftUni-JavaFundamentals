package DataTypesAndVariables_02.Lab;

import java.util.Scanner;

public class LowerToUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        int asciiNumber = (int) symbol;

        if (asciiNumber >= 97 && asciiNumber <= 112){
            System.out.println("lower-case");
        } else if (asciiNumber >= 65 && asciiNumber <= 90){
            System.out.println("upper-case");
        }
    }
}
