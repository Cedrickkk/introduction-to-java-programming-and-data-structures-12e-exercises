package main.chapter12;

import java.util.Scanner;

public class TestScannerReadFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        String line = input.nextLine();

        System.out.println(intValue);
        System.out.println(line);
    }
}
