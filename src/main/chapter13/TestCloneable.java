package main.chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCloneable {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2025, Calendar.AUGUST, 1);
        Calendar calendar1 = calendar;
        Calendar calendar2 = (Calendar) calendar.clone();
        System.out.println("calendar == calendar1 is " + (calendar == calendar1));
        System.out.println("calendar == calendar2 is " + (calendar == calendar2));
        System.out.println("calendar.equals(calendar2) is " + calendar.equals(calendar2));

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(2.5);
        list1.add(3.5);

        ArrayList<Double> list2 = (ArrayList<Double>) list1.clone();
        ArrayList<Double> list3 = list1;
        list2.add(4.5);
        list3.remove(1.5);

        System.out.println("list1  is" + list1);
        System.out.println("list2  is" + list2);
        System.out.println("list3  is" + list3);

        int[] intArr = {1, 2, 3};
        int[] clonedIntArr = intArr.clone();

        intArr[0] = 7;
        clonedIntArr[1] = 8;
        System.out.println("intArr is " + Arrays.toString(intArr));
        System.out.println("clonedIntArr is " + Arrays.toString(clonedIntArr));

        System.out.println();
    }
}
