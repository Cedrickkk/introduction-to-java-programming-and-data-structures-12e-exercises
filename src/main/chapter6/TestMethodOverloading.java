package main.chapter6;

public class TestMethodOverloading {
    public static void main(String[] args) {
        System.out.println("The maximum  of 3 and 4 is " + max(3, 4));
        System.out.println("The maximum  of 3.0 and 5.4 is " + max(3.0, 5.4));
        System.out.println("The maximum  of 3.0, 5.4, and 10.4 is " + max(3.0, 5.4, 10.4));
     
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a >= b) ? a : b;
    }

    public static double max(double a, double b, double c) {
        return max(max(a, b), c);
    }
}
