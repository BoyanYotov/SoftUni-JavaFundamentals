package AssosiativeArrays_08.Exercise;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> register = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!register.containsKey(courseName)) {
                register.put(courseName, new ArrayList<>());
                register.get(courseName).add(studentName);
            } else {
                register.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : register.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            entry.getValue().forEach(a -> System.out.printf("-- %s%n", a));
        }
    }
}
