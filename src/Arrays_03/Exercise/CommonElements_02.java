package Arrays_03.Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i <= secondArray.length - 1 ; i++) {
            String firstElement = secondArray[i];

            for (int j = 0; j <= firstArray.length - 1 ; j++) {

                if (firstElement.equals(firstArray[j])){
                    System.out.print(firstElement + " ");
                }
            }
        }
    }
}
