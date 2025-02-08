package Arrays_03.Extra;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] finalArray = new int[n];
        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();

            int totalName = 0;

            for (int j = 0; j <= name.length() - 1 ; j++) {
                char letter = name.charAt(j);

                if ((((((((((((((((int) letter == 97 || (int)letter == 101) || (int)letter == 105)
                        ||(int) letter == 111 || (int)letter == 117 || (int)letter ==65
                        || (int)letter ==69 || (int)letter ==73 || (int)letter ==79 || (int)letter ==85))))))))))))){
                    letter *= name.length();
                } else {
                    letter /= name.length();
                }

                totalName += letter;


                for (int k = 0; k <= finalArray.length - 1 ; k++) {
                    finalArray[k] = totalName;
                }

            }
            Arrays.sort(finalArray);

        }
        for (int i1 : finalArray) {
            System.out.println(i1);
        }
    }
}
