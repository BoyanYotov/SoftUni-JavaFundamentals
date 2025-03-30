package ClassesAndObjects_07.Exercise.AdvertisementMessage_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Message message = new Message();

        for (int i = 0; i <= n ; i++) {
            String phrase = message.getRandomPhrase();
            String event = message.getRandomEvent();
            String author = message.getRandomAuthor();
            String city = message.getRandomCity();

            System.out.printf("%s %s %s - %s%n", phrase,event,author,city);
        }


    }
}
