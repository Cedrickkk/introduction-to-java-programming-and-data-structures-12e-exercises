package main.chapter10;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");
        System.out.println(stringBuilder);
        stringBuilder.insert(11, "HTML and ");
        System.out.println(stringBuilder);

        System.out.println("---------------------------------");
        StringBuilder builder = new StringBuilder("Welcome to Java");
        System.out.println(builder.delete(8, 11));
        System.out.println(builder.deleteCharAt(8));
        System.out.println(builder.reverse());
        System.out.println(builder.replace(11, 15, "HTML"));
        builder.setCharAt(0, 'w');
        System.out.println(builder);
        System.out.println(builder.capacity());
    }
}
