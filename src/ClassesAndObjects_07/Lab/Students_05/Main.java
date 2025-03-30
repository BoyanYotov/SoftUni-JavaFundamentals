package ClassesAndObjects_07.Lab.Students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!command.equals("end")){
            String[] data = command.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            Student student = new Student(firstName,lastName,age,homeTown);
            students.add(student);

            command = scanner.nextLine();
        }

        String cityName =scanner.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(cityName)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }


    }
}
