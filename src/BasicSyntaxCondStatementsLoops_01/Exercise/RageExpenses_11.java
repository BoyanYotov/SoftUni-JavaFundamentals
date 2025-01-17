package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetExpenses = (lostGameCount/2)*headsetPrice;
        double mouseExpenses = (lostGameCount/3)*mousePrice;
        double keyboardExpenses = (lostGameCount/6)*keyboardPrice;
        double displayExpenses = (lostGameCount/12)*displayPrice;
        double totalExpenses = headsetExpenses+mouseExpenses+keyboardExpenses+displayExpenses;

        System.out.printf("Rage expenses: %.2f lv.",totalExpenses);


    }
}
