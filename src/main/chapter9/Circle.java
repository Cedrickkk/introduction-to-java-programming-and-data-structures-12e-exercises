package main.chapter9;

public class Circle {
    double radius;
    static int numberOfObjects;

    Circle() {
        this.radius = 1;
    }

    Circle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
