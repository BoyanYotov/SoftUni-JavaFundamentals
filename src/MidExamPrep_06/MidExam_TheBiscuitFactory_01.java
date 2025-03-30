package MidExamPrep_06;

import java.util.Scanner;

public class MidExam_TheBiscuitFactory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        long otherFactory = Long.parseLong(scanner.nextLine());
        int totalAmount = 0;

        for (int i = 1; i <= 30; i++) {
            double productionPerDay = biscuitsPerDayPerWorker * workers;

            if (i % 3 == 0) {
                productionPerDay = Math.floor(productionPerDay * 0.75);
            }

            totalAmount += productionPerDay;
        }

        System.out.printf("You have produced %d biscuits for the past month.%n", totalAmount);

        if (totalAmount > otherFactory) {
            System.out.printf("You produce %.2f percent more biscuits.", (totalAmount - otherFactory) * 1.0 / otherFactory * 100);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", (otherFactory - totalAmount) * 1.0 / otherFactory * 100);
        }
    }
}
