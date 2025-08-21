package main.chapter12.quiz;

public class CalculatorWithException {
    public static void main(String[] args) {
        calculateWithException(args);
    }

    public static void calculateWithException(String[] args) {
        try {
            int result = 0;
            char operand = args[1].charAt(0);

            switch (operand) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
            }

            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

        } catch (IllegalArgumentException ex) {
            System.out.println("Wrong input: " + ex.getMessage());
        }
    }
}
