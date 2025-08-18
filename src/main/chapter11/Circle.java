package main.chapter11;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Circle) {
            return radius == ((Circle) o).getRadius();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                ", dateCreated='" + super.getDateCreated() + '\'' +
                '}';
    }
}
