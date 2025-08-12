package main.chapter9.quiz;

public class TestFan {
    public static void main(String[] args) {
        Fan one = new Fan();
        one.setOn(true);
        one.setSpeed(Fan.FAST);
        one.setColor("yellow");

        Fan two = new Fan();
        two.setOn(true);
        two.setSpeed(Fan.MEDIUM);
        two.setOn(false);

        System.out.println(one);
        System.out.println(two);
    }
}
