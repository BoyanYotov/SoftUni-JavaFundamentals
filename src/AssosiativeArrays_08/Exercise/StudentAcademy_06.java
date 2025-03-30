package AssosiativeArrays_08.Exercise;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> gradesRegister = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            if (!gradesRegister.containsKey(studentName)) {
                gradesRegister.put(studentName, new ArrayList<>());
                gradesRegister.get(studentName).add(studentGrade);
            } else {
                gradesRegister.get(studentName).add(studentGrade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : gradesRegister.entrySet()) {
            double averageGrade = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();

            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
            }
        }
    }
}
