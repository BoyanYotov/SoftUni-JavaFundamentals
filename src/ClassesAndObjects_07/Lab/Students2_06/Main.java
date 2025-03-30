package ClassesAndObjects_07.Lab.Students2_06;

import ClassesAndObjects_07.Lab.Students_05.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Student> newStudents = new ArrayList<>();

        while (!command.equals("end")){
            String[] data = command.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            Student newStudent = new Student(firstName,lastName,age,homeTown);
            boolean isDouble = false;

            for (Student student : newStudents) {
                if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                    isDouble = true;
                    student.setFirstName(firstName);
                    student.setLastName(lastName);
                    student.setAge(age);
                    student.setHomeTown(homeTown);
                }
            }
            if (!isDouble){
                newStudents.add(newStudent);
            }

            command = scanner.nextLine();
        }

        String cityName = scanner.nextLine();

        for (Student newStudent : newStudents) {
            if (newStudent.getHomeTown().equals(cityName)){
                System.out.printf("%s %s is %d years old%n",newStudent.getFirstName(),newStudent.getLastName(),newStudent.getAge());
            }
        }
    }
}
