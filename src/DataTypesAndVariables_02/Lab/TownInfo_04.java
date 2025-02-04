package DataTypesAndVariables_02.Lab;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        long area = Long.parseLong(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",townName,population,area);
    }
}
