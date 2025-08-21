package main.chapter12;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class TestReadFromWeb {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://google.com/index.html");
        try (Scanner input = new Scanner(url.openStream())) {
            int count = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters.");
        }
    }
}
