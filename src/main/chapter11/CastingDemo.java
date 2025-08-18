package main.chapter11;

public class CastingDemo {
    public static void main(String[] args) {
        Object object = new Circle(1);
        Object object1 = new Rectangle(1, 1);

        displayObject(object);
        displayObject(object1);
        
    }

    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is: " + ((Circle) object).getArea());
            System.out.println("The circle diameter is : " + ((Circle) object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is: " + ((Rectangle) object).getArea());
        }
    }
}
