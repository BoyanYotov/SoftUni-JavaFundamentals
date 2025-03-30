package Arrays_03.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Lift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] lifts = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean availablePlaces = false;

        for (int i = 0; i <= lifts.length - 1; i++) {
            int currentLift = lifts[i];

            while (currentLift < 4 && waitingPeople > 0) {
                currentLift++;
                waitingPeople--;
            }

            lifts[i] = currentLift;

            availablePlaces = currentLift < 4;
        }

        if (availablePlaces && waitingPeople == 0) {
            System.out.println("The lift has empty spots!");
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        } else if (!availablePlaces && waitingPeople == 0) {
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        } else if (!availablePlaces && waitingPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
            for (int lift : lifts) {
                System.out.print(lift + " ");
            }
        }

    }
}
