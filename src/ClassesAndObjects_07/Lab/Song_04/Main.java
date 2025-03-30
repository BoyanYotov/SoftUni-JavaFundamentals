package ClassesAndObjects_07.Lab.Song_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> collection = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("_");

            String list = data[0];
            String songName = data[1];
            String time = data[2];

            Song song = new Song(list,songName,time);
            collection.add(song);
        }

        String command = scanner.nextLine();

        if (command.equals("all")){
            for (Song song : collection) {
                System.out.println(song.getSongName());
            }
        } else {
            for (Song song : collection) {
                if (song.getTypeList().equals(command)){
                    System.out.println(song.getSongName());
                }
            }
        }

    }
}
