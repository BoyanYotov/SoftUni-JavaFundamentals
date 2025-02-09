package MidExamPrep_06;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeCapacity = Integer.parseInt(scanner.nextLine());
        int secondEmployeeCapacity = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeCapacity = Integer.parseInt(scanner.nextLine());
        int totalStudents = Integer.parseInt(scanner.nextLine());

        int totalCapacity = firstEmployeeCapacity + secondEmployeeCapacity + thirdEmployeeCapacity;
        int hoursCount = 0;
        while (totalStudents > 0){

            totalStudents -= totalCapacity;
            hoursCount++;

            if (hoursCount % 4 ==0){
                hoursCount++;
            }
        }

        System.out.printf("Time needed: %dh.",hoursCount);

    }
}
