package main.chapter7.quiz;

public class RandomNumberSelector {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int randomNumberFromList = getRandom(list);
        System.out.println("A random number from list: " + randomNumberFromList);
    }

    public static int getRandom(int... numbers) {
        return numbers[(int) (Math.random() * numbers.length) + 1];
    }
}
