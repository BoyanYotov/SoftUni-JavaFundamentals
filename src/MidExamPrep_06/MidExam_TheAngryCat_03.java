package MidExamPrep_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidExam_TheAngryCat_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> items = Arrays.stream(scanner.nextLine().split(", ")).map(Long::parseLong).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        long sumRight = 0;
        long sumLeft = 0;
        long entryItem = items.get(entryPoint);

        for (int i = entryPoint + 1; i <= items.size() - 1; i++) {
            long currentItem = items.get(i);
            if (type.equals("cheap")) {
                if (currentItem < entryItem) {
                    sumRight += currentItem;
                }
            } else if (type.equals("expensive")) {
                if (currentItem >= entryItem) {
                    sumRight += currentItem;
                }
            }
        }

        for (int i = 0; i <= entryPoint - 1; i++) {
            long currentItem = items.get(i);
            if (type.equals("cheap")) {
                if (currentItem < entryItem) {
                    sumLeft += currentItem;
                }
            } else if (type.equals("expensive")) {
                if (currentItem >= entryItem) {
                    sumLeft += currentItem;
                }
            }
        }

        if (sumRight > sumLeft) {
            System.out.printf("Right - %d", sumRight);
        } else {
            System.out.printf("Left - %d", sumLeft);
        }

    }
}
