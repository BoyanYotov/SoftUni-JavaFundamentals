package RegularExpressions_10.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int countLetters = 0;
            String message = scanner.nextLine();
            for (char symbol : message.toCharArray()) {
                switch (symbol) {
                    case 'a', 'A', 's', 'S', 't', 'T', 'r', 'R' -> countLetters++;
                }
            }

            StringBuilder newMessage = new StringBuilder();

            for (char symbol : message.toCharArray()) {
                symbol = (char) ((int) symbol - countLetters);
                newMessage.append(symbol);
            }

            Matcher matcher = pattern.matcher(newMessage);

            if (matcher.find()) {
                if (matcher.group("attackType").equals("A")) {
                    attackedPlanets.add(matcher.group("planetName"));
                } else if (matcher.group("attackType").equals("D")) {
                    destroyedPlanets.add(matcher.group("planetName"));
                }
            }
        }

        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d\n", attackedPlanets.size());

        for (String attackedPlanet : attackedPlanets) {
            System.out.println("-> " + attackedPlanet);
        }

        System.out.printf("Destroyed planets: %d\n", destroyedPlanets.size());
        for (String destroyedPlanet : destroyedPlanets) {
            System.out.println("-> " + destroyedPlanet);
        }

    }
}
