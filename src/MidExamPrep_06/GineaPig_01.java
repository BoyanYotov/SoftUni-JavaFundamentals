package MidExamPrep_06;

import java.util.Scanner;

public class GineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodPerMonth = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayPerMonth = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverPerMonth = Double.parseDouble(scanner.nextLine()) * 1000;
        double pigWeight = Double.parseDouble(scanner.nextLine()) * 1000;

        int countDays = 0;

        for (int i = 1; i <= 30 ; i++) {
        foodPerMonth -= 300;

        if (i % 2 == 0 ){
            hayPerMonth -= foodPerMonth*0.05;
        }

        if (i % 3 == 0){
            coverPerMonth -= pigWeight * 1/3;
        }

        }

        if (foodPerMonth >= 0 && hayPerMonth >=0 && coverPerMonth >=0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodPerMonth/1000,hayPerMonth/1000,coverPerMonth/1000);
        } else {
            System.out.print("Merry must go to the pet store!");
        }
    }
}
