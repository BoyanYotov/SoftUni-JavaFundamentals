package TextProcessing_09.Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] filePath = scanner.nextLine().split("\\\\");

        String fileName = filePath[filePath.length - 1].split("\\.")[0];
        String fileExtension = filePath[filePath.length - 1].split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }

}
