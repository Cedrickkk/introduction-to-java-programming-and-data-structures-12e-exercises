package main.chapter11.quiz;

import main.chapter11.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1 = 0.0;
    private double side2 = 0.0;
    private double side3 = 0.0;

    public static void main(String[] args) {
        System.out.println(new Triangle());
    }

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                ", dateCreated='" + super.getDateCreated() + '\'' +
                '}';
    }
}
