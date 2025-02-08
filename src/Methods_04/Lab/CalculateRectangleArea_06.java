package Methods_04.Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        System.out.println(rectangularArea(length,height));
    }

    public static int rectangularArea(int a, int b){
        return a * b;
    }

}
