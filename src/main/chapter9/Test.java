package main.chapter9;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        _Circle circle1 = new _Circle(1);
        _Circle circle2 = new _Circle(2);
        swap1(circle1, circle2);
        System.out.println("After swap1: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
        swap2(circle1, circle2);
        System.out.println("After swap2: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);


        int[] a = {1, 2};
        swap(a[0], a[1]);
        System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
        swap(a);
        System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);

        T t = new T();
        swap(t);
        System.out.println("e1 = " + t.e1 + " e2 = " + t.e2);

        T t1 = new T();
        T t2 = new T();
        System.out.println("t1's i = " + t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " + t2.i + " and j = " + t2.j);

        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());

    }

    public static void swap1(_Circle x, _Circle y) {
        _Circle temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(_Circle x, _Circle y) {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }

    public static void swap(T t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }

    public static void m1(Date date) {
        date = null;
    }
}

class _Circle {
    double radius;

    _Circle(double radius) {
        this.radius = radius;
    }
}

class T {
    static int i = 0;
    int j = 0;
    int e1 = 1;
    int e2 = 2;

    T() {
        i++;
        j = 1;
    }
}

