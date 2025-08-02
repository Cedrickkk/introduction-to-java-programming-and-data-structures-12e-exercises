package main.chapter6;

public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 250;
        final int CHARS_PER_LINE = 50;

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomUpperCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
