package Arrays_03.Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] train = new int[n];
        int totalPassengers = 0;

        for (int i = 0; i <= train.length - 1 ; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            totalPassengers += train[i];
        }

        for (int i = 0; i <= train.length - 1; i++) {
            System.out.print(train[i] + " ");
        }

        System.out.println();
        System.out.println(totalPassengers);
    }
}
