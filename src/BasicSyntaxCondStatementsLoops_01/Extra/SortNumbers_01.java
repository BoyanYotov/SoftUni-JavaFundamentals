package BasicSyntaxCondStatementsLoops_01.Extra;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int biggestNumber = 0;
        int middleNumber = 0;
        int smallestNumber = 0;

        if (n1 >= n2 && n1 >= n3){
            biggestNumber = n1;
        }
        if (n2 >= n1 && n2 >= n3){
            biggestNumber = n2;
        }
        if (n3 >= n1 && n3 >= n2){
            biggestNumber = n3;
        }

        if (n1 <= n2 && n1 <= n3){
            smallestNumber = n1;
        }
        if (n2 <= n1 && n2 <= n3){
            smallestNumber = n2;
        }
        if (n3 <= n1 && n3 <= n2){
            smallestNumber = n3;
        }

        middleNumber = (n1 + n2 + n3) - biggestNumber - smallestNumber;

        System.out.printf("%d%n%d%n%d",biggestNumber,middleNumber,smallestNumber);

    }
}
