package Lists_05.Extra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List <String> message = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        String password = "";

        for (int i = 0; i <= numbers.size() - 1 ; i++) {
            int number = numbers.get(i);

            int sum = 0;
            while (number > 0){
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            if (sum <= message.size() - 1) {
                String letter = message.get(sum);
                password += letter;
                message.remove(sum);
            } else {
                String letter = message.get(sum-message.size());
                password += letter;
                message.remove(sum-message.size());
            }
        }

        System.out.println(password);
    }
}
