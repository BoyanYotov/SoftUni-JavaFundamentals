package DataTypesAndVariables_02.Exercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long initialPokePower = Integer.parseInt(scanner.nextLine());
    long pokePower = initialPokePower;

    int distance = Integer.parseInt(scanner.nextLine());
    byte exhaustionFactor = Byte.parseByte(scanner.nextLine());

    int targetCount = 0;

    while (pokePower >= distance){
        pokePower -= distance;
        targetCount++;

        if ((pokePower == initialPokePower * 0.5) && (exhaustionFactor !=0)) {
                pokePower = pokePower / exhaustionFactor;
            }
        }

        System.out.println(pokePower);
        System.out.println(targetCount);
    }
}