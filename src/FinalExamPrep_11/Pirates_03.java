package FinalExamPrep_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,Integer> citiesPopulation = new LinkedHashMap<>();
        Map<String,Integer> citiesGold = new LinkedHashMap<>();

        while (!input.equals("Sail")){
            String city = input.split("\\|\\|")[0];
            String pop = input.split("\\|\\|")[1];
            String gol = input.split("\\|\\|")[2];
            int population = Integer.parseInt(pop);
            int gold = Integer.parseInt(gol);

            if (!citiesPopulation.containsKey(city)){
                citiesPopulation.put(city,population);
            } else {
                int currentPopulation = citiesPopulation.get(city);
                citiesPopulation.put(city, currentPopulation + population);
            }

            if (!citiesGold.containsKey(city)){
                citiesGold.put(city,gold);
            } else {
                int currentGold = citiesGold.get(city);
                citiesGold.put(city, currentGold + gold);
            }

            input = scanner.nextLine();
        }

        String action = scanner.nextLine();

        while (!action.equals("End")){
            if (action.contains("Plunder")){
                String town = action.split("=>")[1];
                int people = Integer.parseInt(action.split("=>")[2]);
                int gold = Integer.parseInt(action.split("=>")[3]);

                int currentPopulation = citiesPopulation.get(town);
                citiesPopulation.put(town,currentPopulation - people);
                int currentGold = citiesGold.get(town);
                citiesGold.put(town, currentGold - gold);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",town,gold,people);

                if (citiesPopulation.get(town) <= 0 || citiesGold.get(town) <= 0){
                    citiesPopulation.remove(town);
                    citiesGold.remove(town);
                    System.out.printf("%s has been wiped off the map!\n",town);
                }

            } else if (action.contains("Prosper")){
                String town = action.split("=>")[1];
                int gold = Integer.parseInt(action.split("=>")[2]);

                if (gold < 0){
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    int currentGold = citiesGold.get(town);
                    citiesGold.put(town, currentGold + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n",gold,town,citiesGold.get(town));
                }
            }

            action = scanner.nextLine();
        }

        if (!citiesPopulation.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",citiesPopulation.size());
            for (Map.Entry<String, Integer> entry : citiesPopulation.entrySet()) {
                String town = entry.getKey();
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",entry.getKey(),entry.getValue(),citiesGold.get(town));
            }


        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}
