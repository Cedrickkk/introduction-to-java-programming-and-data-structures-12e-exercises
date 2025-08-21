package main.chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/chapter12/scores.txt");

        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(0);
        }

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("John Cedric Panti ");
            writer.println(90);
            writer.print("Russel Jay Santos ");
            writer.println(85);
            System.out.println("Successful write to " + file.getName());
        }
    }
}
