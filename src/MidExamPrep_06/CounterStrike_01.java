package MidExamPrep_06;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int winsCount = 0;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

            if (initialEnergy < distance || initialEnergy == 0){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",winsCount,initialEnergy);
                return;
            } else {
                initialEnergy -= distance;
                winsCount++;
            }

            if (winsCount % 3 == 0 ){
               initialEnergy += winsCount;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d",winsCount,initialEnergy);

    }
}
