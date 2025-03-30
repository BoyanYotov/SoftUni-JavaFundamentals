package FinalExamPrep_11;

import java.util.*;

public class FinalExam_HeroRecruitment_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> heroRegister = new LinkedHashMap<>();

        while (!command.equals("End")){
            String heroName = command.split("\\s+")[1];
            if (command.contains("Enroll")){
            if (!heroRegister.containsKey(heroName)){
                heroRegister.put(heroName,new ArrayList<>());
            } else {
                System.out.printf("%s is already enrolled.\n",heroName);
            }

            } else if (command.contains("Learn")){
            String spellName = command.split("\\s+")[2];
            if (!heroRegister.containsKey(heroName)){
                System.out.printf("%s doesn't exist.\n",heroName);
            } else if (heroRegister.get(heroName).contains(spellName)) {
                System.out.printf("%s has already learnt %s.\n",heroName,spellName);
            } else if (heroRegister.containsKey(heroName) && !heroRegister.get(heroName).contains(spellName)) {
                heroRegister.get(heroName).add(spellName);
            }

            } else if (command.contains("Unlearn")){
                String spellName = command.split("\\s+")[2];
                if (!heroRegister.containsKey(heroName)){
                    System.out.printf("%s doesn't exist.\n",heroName);
                } else if (heroRegister.containsKey(heroName) && !heroRegister.get(heroName).contains(spellName)){
                    System.out.printf("%s doesn't know %s.\n",heroName,spellName);
                } else if (heroRegister.containsKey(heroName) && heroRegister.get(heroName).contains(spellName)){
                    heroRegister.get(heroName).remove(spellName);
                }
            }

            command = scanner.nextLine();
        }

        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> entry : heroRegister.entrySet()) {
            System.out.printf("== %s: %s\n",entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
