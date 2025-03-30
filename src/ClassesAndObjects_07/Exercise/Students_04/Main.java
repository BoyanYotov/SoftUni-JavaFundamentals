package ClassesAndObjects_07.Exercise.Students_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            String surname = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(name, surname,grade);

            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.printf("%s %s: %.2f%n",student.getName(),student.getSurname(),student.getGrade());
        }
    }
}
