package Arrays_03.Lab;

import java.util.Scanner;

public class DaysOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfTheWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int day = Integer.parseInt(scanner.nextLine());

        if (day >= 1 && day <= 7){
            System.out.println(daysOfTheWeek[day-1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
