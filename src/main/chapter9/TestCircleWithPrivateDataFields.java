package main.chapter9;

public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateDataFields circle = new CircleWithPrivateDataFields();

        System.out.printf(
                "The area of the circle of radius %.2f is %.2f",
                circle.getRadius(), circle.getArea()
        );

        // Increase radius by 10%
        circle.setRadius(circle.getRadius() * 1.1);
        printCircle(circle);

        System.out.println(
                "\nThe number of objects created is "
                        + CircleWithPrivateDataFields.getNumberOfObjects()
        );
    }

    public static void printCircle(CircleWithPrivateDataFields circle) {
        System.out.printf(
                "The area of the circle of radius %.2f is %.2f",
                circle.getRadius(), circle.getArea()
        );
    }
}
