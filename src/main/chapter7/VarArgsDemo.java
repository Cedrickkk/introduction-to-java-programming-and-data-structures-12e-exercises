package main.chapter7;

public class VarArgsDemo {
    public static void main(String[] args) {
        printMax();
        printMax(new double[]{10, 2, 31, 213});
        printMax(100, 20, 30, 1003, 401, 12);
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum number of the varags is " + max);
    }
}
