package DataTypesAndVariables_02.Lab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String deliminator = scanner.nextLine();

        System.out.print(name1 + deliminator + name2);

    }
}
