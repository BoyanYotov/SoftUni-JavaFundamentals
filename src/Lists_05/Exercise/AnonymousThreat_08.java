package Lists_05.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("3:1")){
            if (command.contains("merge")){
            int startIndex = Integer.parseInt(command.split(" ")[1]);
            int endIndex = Integer.parseInt(command.split(" ")[2]);

            if (startIndex < 0) {
                startIndex = 0;
            }

            if (endIndex > input.size()-1){
                endIndex = input.size()-1;
            }

            if (startIndex >= 0 && startIndex < endIndex && endIndex >= 0 && endIndex <= input.size() - 1) {
                String joined = "";

                for (int i = startIndex; i <= endIndex; i++) {
                        String item = input.get(i);
                        joined += item;
                    }

                    for (int i = endIndex; i >= startIndex; i--) {
                        String item = input.get(i);
                        input.remove(item);
                    }
                    input.add(startIndex, joined);
                }
            } else if (command.contains("divide")){
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);

                String textToDivide = input.get(index);
                input.remove(index);
                int partSize = textToDivide.length() / partitions;

                int begin = 0;
                for (int i = 1; i < partitions ; i++) {
                    String part = textToDivide.substring(begin,begin+partSize);
                    input.add(index,part);
                    index++;
                    begin += partSize;
                }

                input.add(index,textToDivide.substring(begin));

            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(" ",input));
    }
}
