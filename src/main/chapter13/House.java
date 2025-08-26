package main.chapter13;

import java.util.Date;
import java.util.Objects;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private Date whenBuilt;


    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        House that = (House) obj;
        return this.getArea() == that.getArea();
    }

    @Override
    public Object clone() {
        try {
            House houseClone = (House) super.clone();
            houseClone.whenBuilt = (Date) whenBuilt.clone();
            return houseClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(House o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getArea());
    }
}
