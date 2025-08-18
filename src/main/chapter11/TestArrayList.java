package main.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Manila");
        cities.add("Denver");
        cities.add("Paris");
        cities.add("Miami");
        cities.add("Tokyo");

        System.out.println("List size? " + cities.size());
        System.out.println("Is Miami in the list? " + cities.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cities.indexOf("Denver"));
        System.out.println("Is the list empty? " + cities.isEmpty());

        cities.add(2, "Xian");
        cities.remove("Miami");
        cities.remove(1);

        System.out.println(cities);

        for (int i = cities.size() - 1; i >= 0; i--) {
            System.out.print(cities.get(i) + " ");
        }

        System.out.println();

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2));
        circles.add(new Circle(3));

        System.out.println("The area of the circle? " + circles.get(0).getArea());

        String[] array = {"Ericka", "Loves", "Cedrick"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        String[] _array = new String[list.size()];
        list.toArray(_array);
        System.out.println(Arrays.toString(_array));

        Integer[] integers = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.println(Collections.min(integerList));
        System.out.println(Collections.max(integerList));

        Collections.shuffle(integerList);
        System.out.println(integerList);

    }
}
