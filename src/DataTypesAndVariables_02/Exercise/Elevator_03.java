package DataTypesAndVariables_02.Exercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleQuantity = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (peopleQuantity / capacity);

        if (courses == 0 || courses % 2 != 0){
            courses++;
        }
        System.out.println(courses);
    }
}
