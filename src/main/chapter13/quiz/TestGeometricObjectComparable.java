package main.chapter13.quiz;

public class TestGeometricObjectComparable {
    public static void main(String[] args) {
        RectangleComparable rectangleComparable = new RectangleComparable(4, 5);
        RectangleComparable _rectangleComparable = new RectangleComparable(5, 9);

        System.out.println(
                "The larger object between rectangleComparable and _rectangleComparable is " +
                        GeometricObjectComparable.max(rectangleComparable, _rectangleComparable)
        );

        CircleComparable circleComparable = new CircleComparable(10);
        CircleComparable _circleComparable = new CircleComparable(20);

        System.out.println(
                "The larger object between circleComparable and _circleComparable is " +
                        GeometricObjectComparable.max(circleComparable, _circleComparable)
        );

        GeometricObjectComparable[] rectanglesComparable = {
                new RectangleComparable(1, 5), new RectangleComparable(20, 15),
                new RectangleComparable(2, 10)
        };

        System.out.println(
                "The larger object between array rectanglesComparable is " +
                        GeometricObjectComparable.max(rectanglesComparable)
        );

        GeometricObjectComparable[] shapes = {
                new CircleComparable(5),
                new RectangleComparable(4, 5),
                new CircleComparable(10),
                new RectangleComparable(2, 10)
        };

        System.out.println(
                "The larger object between shapes is " +
                        GeometricObjectComparable.max(shapes).getArea()
        );
    }
}
