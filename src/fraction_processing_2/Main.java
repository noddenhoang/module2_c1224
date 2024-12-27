package fraction_processing_2;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(1, 2);
        fraction.output();
        Fraction fraction2 = new Fraction(3);
        fraction2.output();
        Fraction fraction3 = new Fraction(-6, -2);
        fraction3.output();
        Fraction fraction4 = new Fraction(3, -1);
        fraction4.output();
        Fraction fraction5 = fraction4.copy();
        fraction5.output();
        fraction5.plus(100);
        fraction5.output();
    }
}
