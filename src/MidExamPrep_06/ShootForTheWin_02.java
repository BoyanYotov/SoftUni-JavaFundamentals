package MidExamPrep_06;

import java.util.*;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        List<Integer> shotTargets = new ArrayList<>();
        int shotsCount = 0;

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);

            if (index < 0 || index > targets.length - 1) {
                command = scanner.nextLine();
                continue;
            } else {
                shotsCount++;
                int currentTarget = targets[index];

                for (int i = 0; i <= targets.length - 1; i++) {

                    if (i == index || targets[i] == -1) {
                        continue;
                    } else {
                        if (targets[i] > currentTarget) {
                            targets[i] -= currentTarget;
                        } else {
                            targets[i] += currentTarget;
                        }
                    }
                }

                shotTargets.add(currentTarget);
                targets[index] = -1;
            }
            command = scanner.nextLine();
        }

        Collections.reverse(shotTargets);
        System.out.printf("Shot targets: %d -> ", shotsCount);
        for (Integer shotTarget : targets) {
            System.out.print(shotTarget + " ");
        }
    }
}
