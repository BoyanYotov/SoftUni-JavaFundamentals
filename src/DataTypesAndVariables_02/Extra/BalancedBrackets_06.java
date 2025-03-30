package DataTypesAndVariables_02.Extra;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean hasOpen = false;
        boolean hasMatch = false;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.charAt(0) == 40 || input.charAt(0) == 41) {
                if (input.charAt(0) == 41) {
                    hasMatch = false;
                    continue;
                }

                if (input.charAt(0) == 40) {
                    hasOpen = true;
                }

                if (input.charAt(0) == 41 && hasOpen) {
                    hasMatch = true;
                    hasOpen = false;
                }
            }


        }

        if (hasMatch && !hasOpen) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}