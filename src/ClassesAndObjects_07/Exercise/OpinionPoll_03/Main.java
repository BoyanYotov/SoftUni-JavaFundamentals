package ClassesAndObjects_07.Exercise.OpinionPoll_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Person> people = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);

            if (person.getAge()>30){
                people.add(person);
            }


        }
        for (Person person1 : people) {
            System.out.printf("%s - %d%n",person1.getName(),person1.getAge());
        }
    }
}
