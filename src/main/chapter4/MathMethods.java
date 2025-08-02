package main.chapter4;

public class MathMethods {
    public static void main(String[] args) {
        randomMethod();
    }

    private static void trigonometricMethods() {
        System.out.println(Math.sin(Math.toRadians(270))); // returns −1.0
        System.out.println(Math.sin(Math.PI / 6));// returns 0.5
        System.out.println(Math.sin(Math.PI / 2));//  1.0
        System.out.println(Math.cos(0));//  1.0
        System.out.println(Math.cos(Math.PI / 6));//  0.866
        System.out.println(Math.cos(Math.PI / 2));//  0
        System.out.println(Math.asin(0.5));//  0.523598333 (same as π/6)
        System.out.println(Math.acos(0.5));//  1.0472 (same as π/3)
        System.out.println(Math.atan(1.0));//  0.785398 (same as π/4)
    }


    private static void exponentialMethods() {
        System.out.println("------Exponent & Logarithms------");
        System.out.println(Math.exp(3.5));
        System.out.println(Math.log(3.5));
        System.out.println(Math.log10(3.5));
        System.out.println("------Power------");
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.pow(4.5, 2.5));
        System.out.println("------Square root------");
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(10.5));
    }

    private static void roundingMethods() {
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(2.1));
        System.out.println(Math.rint(2.5));
    }

    private static void randomMethod() {
        System.out.println((int) (Math.random() * 50) + 50);
    }
}
