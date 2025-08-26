package main.chapter13.casestudy;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long _numerator = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
        long _denominator = denominator * secondRational.getDenominator();
        return new Rational(_numerator, _denominator);
    }

    public Rational subtract(Rational secondRational) {
        long _numerator = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
        long _denominator = denominator * secondRational.getDenominator();
        return new Rational(_numerator, _denominator);
    }

    public Rational multiply(Rational secondRational) {
        long _numerator = numerator * secondRational.getNumerator();
        long _denominator = denominator * secondRational.getDenominator();
        return new Rational(_numerator, _denominator);
    }

    public Rational divide(Rational secondRational) {
        long _numerator = numerator * secondRational.getDenominator();
        long _denominator = denominator * secondRational.getNumerator();
        return new Rational(_numerator, _denominator);
    }

    public long gcd(long numerator, long denominator) {
        long _numerator = Math.abs(numerator);
        long _denominator = Math.abs(denominator);
        int gcd = 1;
        for (int k = 2; k <= _numerator && k <= _denominator; k++) {
            if (_numerator % k == 0 && _denominator % k == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.subtract((Rational) obj).getNumerator() == 0;
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0) return 1;
        else if (this.subtract(o).getNumerator() < 0) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        if (numerator == 0 || denominator == 1) return numerator + "";
        else return numerator + "/" + denominator;
    }
}
