package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double total = (saberPrice * (Math.ceil(students * 1.1)) +
                (robePrice * students) + (beltPrice * students));

        double discount = (students / 6) * beltPrice;
        double totalFinal = total - discount;

        if (totalFinal <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.",totalFinal);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",totalFinal-budget);
        }
    }
}
