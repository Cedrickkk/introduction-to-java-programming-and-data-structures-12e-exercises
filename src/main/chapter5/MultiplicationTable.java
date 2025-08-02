package main.chapter5;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\tMultiplication Table");
        System.out.print("\t");
        for (int j = 1; j <= 9; j++) {
            System.out.print("   " + j);
        }
        System.out.println("\n — — — — — — — — — — —— — — — — — — — —");

        // Display the body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
