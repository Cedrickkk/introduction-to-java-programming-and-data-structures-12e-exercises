package main.chapter9;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println(Circle.numberOfObjects);

        Circle circle = new Circle();
        System.out.println(
                "The area of the circle of radius " + circle.radius + " is " + circle.getArea()
        );

        Circle circle1 = new Circle(25);
        System.out.println(
                "The area of the circle of radius " + circle1.radius + " is " + circle1.getArea()
        );

        Circle circle2 = new Circle(125);
        System.out.println(
                "The area of the circle of radius " + circle2.radius + " is " + circle2.getArea()
        );

        Circle circle3 = new Circle(100);
        System.out.println(
                "The area of the circle of radius " + circle3.radius + " is " + circle3.getArea()
        );

        circle2.radius = 100;
        System.out.println(
                "The area of the circle of radius " + circle2.radius + " is " + circle2.getArea()
        );

        System.out.printf(
                "Area is %.2f", new Circle(5).getArea()
        );

        System.out.println("\nAfter creating objects");
        System.out.println(Circle.numberOfObjects);
    }
}