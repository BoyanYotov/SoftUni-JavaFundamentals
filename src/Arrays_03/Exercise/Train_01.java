package Arrays_03.Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] train = new int[wagons];
        int totalpassengers = 0;

        for (int i = 0; i <= train.length - 1; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            totalpassengers += train[i];
        }

        for (int i : train) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(totalpassengers);
    }
}
