package main.chapter11;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle(1, "Red", false));
        displayObject(new Rectangle(1, 1, "Black", true));

        Object o = new GeometricObject();
        System.out.println(o);
    }

    public static void displayObject(GeometricObject geometricObject) {
        System.out.println(
                "Created on " + geometricObject.getDateCreated() +
                        ". Color is " + geometricObject.getColor()
        );
    }
}
