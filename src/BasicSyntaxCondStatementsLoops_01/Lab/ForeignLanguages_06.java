package BasicSyntaxCondStatementsLoops_01.Lab;

import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        if (country.equals("USA") || country.equals("England")){
            System.out.print("English");
        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")){
            System.out.println("Spanish");
        } else {
            System.out.print("unknown");
        }

    }
}
