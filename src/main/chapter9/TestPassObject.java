package main.chapter9;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields circle =
                new CircleWithPrivateDataFields(1);

        int n = 5;
        printAreas(circle, n);

        System.out.println("\n" + "Radius is " + circle.getRadius());
        System.out.println("n is " + n);
    }


    public static void printAreas(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\t Area");
        while (times >= 1) {
            System.out.printf("%6.2f \t\t%6.2f\n", c.getRadius(), c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}

