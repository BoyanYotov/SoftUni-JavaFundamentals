package FinalExamPrep_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceComposer = new LinkedHashMap<>();
        Map<String, String> pieceKey = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split("\\|");

            String piece = command[0];
            String composer = command[1];
            String key = command[2];

            pieceComposer.putIfAbsent(piece, composer);
            pieceKey.putIfAbsent(piece, key);

        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String piece = command.split("\\|")[1];

            if (command.contains("Add")) {
                String composer = command.split("\\|")[2];
                String key = command.split("\\|")[3];
                if (pieceComposer.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!\n", piece);
                } else {
                    pieceComposer.put(piece, composer);
                    pieceKey.put(piece, key);
                    System.out.printf("%s by %s in %s added to the collection!\n",piece,composer,key);
                }
            } else if (command.contains("Remove")) {
                if (pieceComposer.containsKey(piece)){
                    pieceComposer.remove(piece);
                    pieceKey.remove(piece);
                    System.out.printf("Successfully removed %s!\n",piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.\n",piece);
                }

            } else if (command.contains("ChangeKey")) {
                String newKey = command.split("\\|")[2];
                if (pieceKey.containsKey(piece)){
                    pieceKey.put(piece,newKey);
                    System.out.printf("Changed the key of %s to %s!\n",piece,newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.\n",piece);
                }
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : pieceComposer.entrySet()) {
            String piece = entry.getKey();
            String composer = entry.getValue();
            String key = pieceKey.get(piece);

            System.out.printf("%s -> Composer: %s, Key: %s\n",piece,composer,key);

        }
    }
}
