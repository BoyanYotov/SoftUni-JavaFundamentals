package MidExamPrep_06;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendances = 0;

        for (int i = 1; i <= students; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double totalBonus = (attendances * 1.0 / lectures) * (5 + additionalBonus);

            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttendances = attendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
