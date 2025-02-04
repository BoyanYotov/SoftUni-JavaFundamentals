package BasicSyntaxCondStatementsLoops_01.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayType = scanner.nextLine();

        double pricePerPerson = 0;

        switch (dayType) {
            case "Friday":
                if (groupType.equals("Students")) {
                    pricePerPerson = 8.45;
                } else if (groupType.equals("Business")) {
                    pricePerPerson = 10.90;
                } else if (groupType.equals("Regular")) {
                    pricePerPerson = 15;
                }
                break;
            case "Saturday":
                if (groupType.equals("Students")) {
                    pricePerPerson = 9.80;
                } else if (groupType.equals("Business")) {
                    pricePerPerson = 15.60;
                } else if (groupType.equals("Regular")) {
                    pricePerPerson = 20;
                }
                break;
            case "Sunday":
                if (groupType.equals("Students")) {
                    pricePerPerson = 10.46;
                } else if (groupType.equals("Business")) {
                    pricePerPerson = 16;
                } else if (groupType.equals("Regular")) {
                    pricePerPerson = 22.50;
                }
                break;
        }

        double totalPrice = pricePerPerson * numberOfPeople;

        if (groupType.equals("Students") && (numberOfPeople >= 30)){
            totalPrice = totalPrice * 0.85;
        }

        if (groupType.equals("Business") && (numberOfPeople >= 100)){
            totalPrice = totalPrice - (10 * pricePerPerson);
        }

        if (groupType.equals("Regular") && (numberOfPeople > 10) && (numberOfPeople <= 20)){
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
