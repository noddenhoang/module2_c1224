package fraction_processing_2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        shorten();
    }

    public void shorten() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    private int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public void output() {
        if (denominator == 1) {
            System.out.println(numerator);
        }
        else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public Fraction copy() {
        return new Fraction(numerator, denominator);
    }

    public void plus(int n){
        numerator += n * denominator;
        shorten();
    }
}
