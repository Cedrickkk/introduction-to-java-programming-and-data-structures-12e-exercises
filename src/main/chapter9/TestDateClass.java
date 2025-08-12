package main.chapter9;

import java.util.Date;

public class TestDateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(
                "The elapsed time since January 1, 1970 is " + date.getTime() + " milliseconds."
        );
    }
}
