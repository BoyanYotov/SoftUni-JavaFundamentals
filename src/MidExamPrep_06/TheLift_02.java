package MidExamPrep_06;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] lifts = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean availablePlace = false;

        for (int i = 0; i <= lifts.length -1 ; i++) {
            int currentLift = lifts[i];

            while (currentLift < 4 && people > 0){
                currentLift++;
                people--;
            }

            lifts[i] = currentLift;

            if (currentLift < 4 ){
                availablePlace = true;
            } else {
                availablePlace = false;
            }
        }

        if (availablePlace && people == 0) {
            System.out.println("The lift has empty spots!");
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        } else if (!availablePlace && people > 0 ){
            System.out.printf("There isn't enough space! %d people in a queue!%n",people);
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        } else {
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        }
    }
}
