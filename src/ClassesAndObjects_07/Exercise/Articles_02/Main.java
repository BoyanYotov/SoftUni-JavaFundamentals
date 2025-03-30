package ClassesAndObjects_07.Exercise.Articles_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String[] data = scanner.nextLine().split(": ");
            String command = data[0];
            String remake = data[1];

            if (command.equals("Edit")){
            article.setContent(remake);
            } else if (command.equals("ChangeAuthor")){
            article.setAuthor(remake);
            } else if (command.equals("Rename")){
            article.setTitle(remake);
            }

        }

//        System.out.println(article.toString());

        System.out.printf("%s - %s: %s",article.getTitle(),article.getContent(),article.getAuthor());
    }
}
