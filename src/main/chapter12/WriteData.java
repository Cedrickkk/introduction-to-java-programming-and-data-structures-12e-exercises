package main.chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/chapter12/scores.txt");
        if (!file.exists()) {
            PrintWriter writer = new PrintWriter(file);
            writer.print("Cedrick: ");
            writer.println(90);
            writer.print("Kerwin: ");
            writer.println(85);
            writer.close();
        } else {
            System.out.println("File already exists.");
            System.exit(0);
        }
    }
}
