package main.chapter6;

public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int k = max(i, j);
        System.out.println(k);
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
