package main.chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("src/main/chapter12/test_scanner.txt"));
        int intValue = input.nextInt();
        String line = input.nextLine();

        System.out.println(intValue);
        System.out.println(line);

        
    }
}
