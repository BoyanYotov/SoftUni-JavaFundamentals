package Methods_04.Exercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int result = ResultOfAllNumbers(firstNumber, secondNumber, thirdNumber);
        System.out.println(result);
    }

    private static int ResultOfAllNumbers(int a, int b, int c){
        int sum = a + b;
        return subtractThirdNumbers(sum,c);
    }

    private static int subtractThirdNumbers (int sum, int c){
        return sum - c;
    }
}
