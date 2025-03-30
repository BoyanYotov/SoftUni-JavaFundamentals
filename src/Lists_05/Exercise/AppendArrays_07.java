package Lists_05.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> numbers = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(numbers);

        for (String number : numbers) {

            if (number.equals("") || number.equals(" ")){
                continue;
            }

            System.out.print(number.trim().replaceAll("\\s+"," ") + " ");
        }

    }
}
