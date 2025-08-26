package main.chapter13.quiz;

import java.util.Date;
import java.util.Objects;

public abstract class GeometricObjectComparable implements Comparable<GeometricObjectComparable> {
    private String color = "white";
    private boolean filled;
    private final Date dateCreated;

    protected GeometricObjectComparable() {
        this.dateCreated = new Date();
    }

    protected GeometricObjectComparable(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public static GeometricObjectComparable max(GeometricObjectComparable a, GeometricObjectComparable b) {
        if (a == null && b == null) return null;
        if (a == null) return b;
        if (b == null) return a;
        return a.compareTo(b) >= 0 ? a : b;
    }

    public static <T extends Comparable<T>> T max(T[] array) {
        Objects.requireNonNull(array, "Array cannot be null.");
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        T maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

//    public static GeometricObjectComparable max(GeometricObjectComparable[] geometricObjectsComparable) {
//        if (geometricObjectsComparable.length == 0) return null;
//        GeometricObjectComparable maxGeometricObjectComparable = geometricObjectsComparable[0];
//        for (int i = 1; i < geometricObjectsComparable.length; i++) {
//            if (geometricObjectsComparable[i].compareTo(maxGeometricObjectComparable) > 0) {
//                maxGeometricObjectComparable = geometricObjectsComparable[i];
//            }
//        }
//        return maxGeometricObjectComparable;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }


    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObjectComparable o) {
        return Double.compare(getArea(), o.getArea());
    }
}
