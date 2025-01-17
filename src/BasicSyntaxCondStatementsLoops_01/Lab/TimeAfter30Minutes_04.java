package BasicSyntaxCondStatementsLoops_01.Lab;

import java.util.Scanner;

public class TimeAfter30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = (hours*60 + minutes) + 30;

        int newHours = timeInMinutes / 60;
        if (newHours>=24){
            newHours=0;
        }
        int newMinutes = timeInMinutes % 60;

        System.out.printf("%d:%02d",newHours,newMinutes);
    }
}
