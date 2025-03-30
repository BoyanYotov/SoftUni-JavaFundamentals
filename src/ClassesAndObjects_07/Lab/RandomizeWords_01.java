package ClassesAndObjects_07.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random random = new Random();

        for (int i = 0; i <= input.size() -1 ; i++) {
            int j = random.nextInt(input.size());
            Collections.swap(input,i,j);
        }

        for (String s : input) {
            System.out.println(s);
        }
    }
}
