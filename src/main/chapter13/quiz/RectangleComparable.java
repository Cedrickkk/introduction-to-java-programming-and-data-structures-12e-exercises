package main.chapter13.quiz;

public class RectangleComparable extends GeometricObjectComparable {
    private double width;
    private double height;

    public RectangleComparable() {
    }

    public RectangleComparable(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleComparable(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "RectangleComparable{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(GeometricObjectComparable o) {
        return Double.compare(getArea(), o.getArea());
    }
}
