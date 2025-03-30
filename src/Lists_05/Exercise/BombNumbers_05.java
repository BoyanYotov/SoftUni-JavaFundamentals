package Lists_05.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>(Arrays.stream(scanner.nextLine()
                            .split(" ")).toList());
        String[] bombAndPower = scanner.nextLine().split(" ");

        String bombNumber = bombAndPower[0];
        int bombPower = Integer.parseInt(bombAndPower[1]);

        while (input.contains(bombNumber)){

            int bombIndex = input.indexOf(bombNumber);

            int start = bombIndex - bombPower;
                if (start <0){
                    start = 0;
                }

            int end = bombIndex + bombPower;
                if (end > input.size()-1){
                    end = input.size()-1;
                }

            for (int i = end; i >= start ; i--) {
                input.remove(i);
            }

        }

        System.out.println(input.stream().mapToInt(Integer::parseInt).sum());
    }
}