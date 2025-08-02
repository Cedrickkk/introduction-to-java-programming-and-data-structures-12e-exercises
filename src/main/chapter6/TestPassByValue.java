package main.chapter6;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before the call x is " + x);
        increment(x);
        System.out.println("After the call x is " + x);

        int i = 20;
        int j = 30;

        System.out.println("\nBefore invoking the swap method 'i' is " + i + " and 'j' is " + j);
        swap(i, j);
        System.out.println("After invoking the swap method 'i' is " + i + " and 'j' is " + j);
    }

    public static void increment(int n) {
        n++;
        System.out.println("in inside the increment method " + n);
    }

    public static void swap(int a, int b) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping 'a' is " + a + " and b is " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\t\tAfter swapping 'a' is " + a + " and 'b' is " + b);
    }
}
