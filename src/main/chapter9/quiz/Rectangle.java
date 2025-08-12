package main.chapter9.quiz;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height * width);
    }

    public void displayInformation() {
        System.out.printf(
                "\n%-15s %-15s %-15s %-15s",
                "Width", "Height", "Area", "Perimeter"
        );
        System.out.println();
        System.out.printf(
                "%-15.2f %-15.2f %-15.2f %-15.2f\n",
                this.width, this.height, this.getArea(), this.getPerimeter()
        );

    }
}
