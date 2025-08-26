package main.chapter13;

import java.util.Arrays;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4),
        };

        Arrays.sort(rectangles);

        for (Rectangle rectangle : rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }

        ComparableRectangle rectangle = new ComparableRectangle(4, 5);
        ComparableRectangle _rectangle = new ComparableRectangle(4, 5);

        System.out.println(rectangle.compareTo(_rectangle) == 0);
        System.out.println(rectangle.equals(_rectangle));

    }
}