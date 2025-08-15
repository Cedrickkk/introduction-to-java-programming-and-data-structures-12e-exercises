package main.chapter10;

public class TestStrings {
    public static void main(String[] args) {
        String message = "Welcome to Java!";
        char[] charArr = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y', '!'};
        String greet = new String(charArr);
        System.out.println(message);
        System.out.println(greet);

        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";
        String s4 = new String("Welcome to Java");
        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s1 == s3 is " + (s1 == s3));
        System.out.println("s2 == s4 is " + (s2 == s4));

        System.out.println("Welcome".replace('e', 'A'));
        System.out.println("Welcome".replaceFirst("e", "AB"));
        System.out.println("Welcome".replace("e", "AB"));
        System.out.println("Welcome".replace("el", "AB"));
        System.out.println("Welcome".replaceAll("e", "AB"));

        String[] tokens = "Java#Javascript#Typescript#React#.NET".split("#");
        for (String token : tokens) {
            System.out.print(token + " ");
        }

        System.out.println("\n-----------------");
        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));

        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));

        String s = "a+b$c#";
        System.out.println(s.replaceAll("[+$#]", "NNN"));

        String[] _tokens = "Java,C?C#,C++".split("[.,:;?]");
        for (String token : _tokens) {
            System.out.print(token + " ");
        }

        System.out.println();
        char[] chars = "Java".toCharArray();
        for (char _char : chars) {
            System.out.print(_char + " ");
        }

        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, dst, 4);
        System.out.println();
        for (char _char : dst) {
            System.out.print(_char + " ");
        }

        System.out.println();
        String java = new String(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(java);

        String _dst = String.valueOf(dst);
        System.out.println(_dst);

        String formattedString = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
        System.out.println(formattedString);

        String _test = "Welcome";
        String _test1 = _test;

        System.out.println(_test == _test1);

        System.out.println("Welcome to Java".replace("o", "abc"));

        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));

        String[] splitStrings = "A,B;C".split("[,;]");
        for (int i = 0; i < splitStrings.length; i++) {
            System.out.print(splitStrings[i] + " ");
        }

        StringBuilder test = new StringBuilder("Test ");

        test.insert(test.indexOf(" ") + 1, "Testing");

        System.out.println(test);

        String reverse = "Reverse";
        String output = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            output += reverse.charAt(i);
        }

        System.out.println(output);
    }
}
