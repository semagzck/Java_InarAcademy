package chapters.chapter_13.Listing;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;

    /** Construct a rational with default properties */
    public Rational() {
        this(0 , 1);
    }
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((numerator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator / gcd);
    }


    // Implement the abstract floatValue, intValue, longValue, doubleValue method in Number
    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    /** Find GCD of two numbers */
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && (n2 % k == 0)) {
                gcd = k;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;

