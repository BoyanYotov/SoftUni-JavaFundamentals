package AssosiativeArrays_08.Exercise;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> register = new LinkedHashMap<>();


        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];

                if (!register.containsKey(forceSide)) {
                    register.put(forceSide, new ArrayList<>());
                }

                boolean isPartOfTeam = false;

                for (List<String> value : register.values()) {
                    if (value.contains(forceUser)) {
                        isPartOfTeam = true;
                        break;
                    }
                }

                if (!isPartOfTeam) {
                    register.get(forceSide).add(forceUser);
                }

            } else if (input.contains("->")) {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                boolean isPartOfTeam = false;

                for (List<String> value : register.values()) {
                    value.remove(forceUser);
                }

                if (register.containsKey(forceSide)) {
                    register.get(forceSide).add(forceUser);
                } else {
                    register.put(forceSide, new ArrayList<>());
                    register.get(forceSide).add(forceUser);
                }

                System.out.printf("%s joins the %s side!\n", forceUser, forceSide);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : register.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());

                entry.getValue().forEach(a -> System.out.println("! " + a));
            }
        }
    }
}
