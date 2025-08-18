package main.chapter10.quiz;

import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        long currentTimeMillis = System.currentTimeMillis();
        setDate(currentTimeMillis);
    }

    public MyDate(long elpasedTime) {
        setDate(elpasedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}
