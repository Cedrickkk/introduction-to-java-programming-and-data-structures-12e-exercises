package main.chapter9.quiz;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        System.out.println(regularPolygon.getPerimeter());
        System.out.println(regularPolygon.getArea());

        System.out.println();

        RegularPolygon regularPolygon1 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(regularPolygon1.getPerimeter());
        System.out.println(regularPolygon1.getArea());
    }
}
