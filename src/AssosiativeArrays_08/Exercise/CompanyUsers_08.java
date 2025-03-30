package AssosiativeArrays_08.Exercise;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> register = new LinkedHashMap<>();

        while (!input.equals("End")){
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (!register.containsKey(companyName)){
                register.put(companyName,new ArrayList<>());
                register.get(companyName).add(employeeId);
            } else if (register.containsKey(companyName) && !register.get(companyName).contains(employeeId)){
                register.get(companyName).add(employeeId);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : register.entrySet()) {
            System.out.printf("%s%n",entry.getKey());

            entry.getValue().forEach(a -> System.out.printf("-- %s%n",a));
        }
    }
}
