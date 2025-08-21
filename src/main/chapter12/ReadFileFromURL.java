package main.chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String urlString = new Scanner(System.in).next();
        System.out.println(urlString);
        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int count = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters.");
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL.");
        } catch (IOException e) {
            System.out.println("I/O Errors: no such file.");
        }
    }
}
