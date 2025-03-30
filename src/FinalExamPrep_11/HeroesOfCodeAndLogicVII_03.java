package FinalExamPrep_11;

import java.util.*;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String heroInformation = scanner.nextLine();
            String heroName = heroInformation.split("\\s+")[0];
            int hitPoints = Integer.parseInt(heroInformation.split("\\s+")[1]);
            int manaPoints = Integer.parseInt(heroInformation.split("\\s+")[2]);
            heroes.put(heroName, new ArrayList<>());
            heroes.get(heroName).add(hitPoints);
            heroes.get(heroName).add(manaPoints);
        }

        String[] command = scanner.nextLine().split(" - ");

        while (!command[0].equals("End")) {
            String hero = command[1];

            if (command[0].contains("CastSpell")) {
                int mpNeeded = Integer.parseInt(command[2]);
                String spellName = command[3];
                int currentMP = heroes.get(hero).get(1);

                if (currentMP >= mpNeeded) {
                    currentMP -= mpNeeded;
                    heroes.get(hero).set(1, currentMP);
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n", hero, spellName, currentMP);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!\n", hero, spellName);
                }

            } else if (command[0].contains("TakeDamage")) {
                int damage = Integer.parseInt(command[2]);
                String attacker = command[3];
                int currentHealth = heroes.get(hero).get(0);
                currentHealth -= damage;
                heroes.get(hero).set(0, currentHealth);

                if (currentHealth > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", hero, damage, attacker, currentHealth);
                } else {
                    heroes.remove(hero);
                    System.out.printf("%s has been killed by %s!\n", hero, attacker);
                }

            } else if (command[0].contains("Recharge")) {
                int amount = Integer.parseInt(command[2]);
                int currentMana = heroes.get(hero).get(1);
                int newMana = currentMana + amount;

                if (newMana > 200) {
                    newMana = 200;
                    System.out.printf("%s recharged for %d MP!\n", hero, 200 - currentMana);
                } else {
                    System.out.printf("%s recharged for %d MP!\n", hero, amount);
                }
                heroes.get(hero).set(1, newMana);

            } else if (command[0].contains("Heal")) {
                int amount = Integer.parseInt(command[2]);
                int currentHealth = heroes.get(hero).get(0);
                int newHealth = currentHealth + amount;

                if (newHealth > 100) {
                    newHealth = 100;
                    System.out.printf("%s healed for %d HP!\n", hero, 100 - currentHealth);
                } else {
                    System.out.printf("%s healed for %d HP!\n", hero, amount);
                }
                heroes.get(hero).set(0, newHealth);
            }

            command = scanner.nextLine().split(" - ");
        }

        for (Map.Entry<String, List<Integer>> entry : heroes.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("HP: " + entry.getValue().get(0));
            System.out.println("MP: " + entry.getValue().get(1));

        }
    }
}
