package RegularExpressions_10.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] demons = scanner.nextLine().replace(" ","").split(",");

        for (String demon : demons) {
            String demonName = demon;
            double health = 0;
            double damage = 0;
            String regex = "\\-?[0-9]+\\.?[0-9]*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(demonName);

            while (matcher.find()){
                damage += Double.parseDouble(matcher.group());
            }

            for (char symbol : demonName.toCharArray()) {
                if (!Character.isDigit(symbol) && symbol != '/' && symbol != '*' && symbol != '+' && symbol != '-' && symbol != '.'){
                    health += (int) symbol;
                } else if (symbol == '/'){
                    damage /= 2;
                } else if (symbol == '*'){
                    damage *= 2;
                }
            }

            System.out.printf("%s - %.0f health, %.2f damage\n",demonName,health,damage);

        }
    }
}
