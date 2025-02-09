package MidExamPrep_06;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunderGathered = 0;

        for (int i = 1; i <= days ; i++) {
            totalPlunderGathered += dailyPlunder;

            if (i % 3 ==0 ){
                totalPlunderGathered += dailyPlunder * 0.5;
            }

            if (i % 5 ==0 ){
                totalPlunderGathered *= 0.7;
            }
        }

        if (totalPlunderGathered >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunderGathered);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.",totalPlunderGathered/expectedPlunder*100);
        }
    }
}
