package Methods_04.Lab;

import java.util.Scanner;

public class GreaterOfTwoValuesV1_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        getMax(scanner, type);

    }

    private static void getMax(Scanner scanner, String type) {
        if (type.equals("int")) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } else if (type.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            if ((int) a > (int) b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } else if (type.equals("string")) {
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            if (input1.equals(input2)) {
                System.out.println(input1);
            } else {
                System.out.println(input2);
            }
        }
    }

}
