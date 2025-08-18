package main.chapter11;

public class Test {
    public static void main(String[] args) {
        Object circle1 = new _Circle();
        Object circle2 = new _Circle();
        System.out.println(circle1.equals(circle2));
    }
}

class _Circle {
    double radius;

    public boolean equals(_Circle circle) {
        return this.radius == circle.radius;
    }
}

