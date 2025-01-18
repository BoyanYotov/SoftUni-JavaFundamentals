package DataTypesAndVariables_02.Exercise;

import java.nio.channels.ClosedByInterruptException;
import java.util.Scanner;

public class SnowBalls_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        double highestValue = 0.0;
        short highestSnowballSnow = 0;
        short highestSnowballTime = 0;
        byte highestSnowballQuality = 0;

        for (int i = 1; i <=n ; i++) {
            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            byte snowballQuality = Byte.parseByte(scanner.nextLine());

            double snowballValue = Math.pow ((snowballSnow * 1.0 / snowballTime),snowballQuality);

            if (snowballValue > highestValue){
                highestValue = snowballValue;
                highestSnowballSnow = snowballSnow;
                highestSnowballTime = snowballTime;
                highestSnowballQuality = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %.0f (%d)",highestSnowballSnow,highestSnowballTime,highestValue,highestSnowballQuality);
    }
}
