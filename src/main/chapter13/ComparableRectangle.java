package main.chapter13;

import java.util.Objects;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ComparableRectangle that = (ComparableRectangle) obj;
        return Double.compare(this.getArea(), that.getArea()) == 0;
    }

    @Override
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() + " Area: " + getArea();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArea());
    }
}
