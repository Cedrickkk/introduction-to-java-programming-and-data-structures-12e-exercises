package main.chapter13;


public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5);
        GeometricObject rectangle = new Rectangle(5, 3);

        System.out.println("The two object have the same area? " + equalArea(circle, rectangle));

        displayGeometricObject(circle);
        displayGeometricObject(rectangle);

    }

    private static boolean equalArea(GeometricObject a, GeometricObject b) {
        return a.getArea() == b.getArea();
    }

    private static void displayGeometricObject(GeometricObject obj) {
        System.out.println();
        System.out.println("The area is: " + obj.getArea());
        System.out.println("The perimeter is: " + obj.getPerimeter());
    }
}
