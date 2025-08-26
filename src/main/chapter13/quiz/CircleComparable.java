package main.chapter13.quiz;

public class CircleComparable extends GeometricObjectComparable {
    private double radius;

    public CircleComparable() {
    }

    public CircleComparable(double radius) {
        this.radius = radius;
    }

    public CircleComparable(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public int compareTo(GeometricObjectComparable o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public String toString() {
        return "CircleComparable{" +
                "radius=" + radius +
                '}';
    }
}
