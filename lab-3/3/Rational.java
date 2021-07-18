public class Rational {
    public int numerator;
    public int denominator;

    public Rational(int num, int den) {
        numerator = num;
        denominator = den;
        
    }
    public void printRational() {
        System.out.println(numerator + "/"  + denominator);
    }
    public void negate() {
        numerator = numerator * -1;
    }
    public void invert() {
        int temp = denominator;
        denominator = numerator;
        numerator = temp;
    }
    public double toDouble() {
        return numerator / denominator;
    }
    public Rational add(Rational other) {
        return new Rational(other.numerator + numerator, other.denominator + denominator);
    }
    public static void main(String[] args) {
        Rational x = new Rational(2, 3);
        x.printRational();

        x.negate();
        x.printRational();

        x.negate();
        x.printRational();

        x.toDouble();
        x.printRational();

        (x.add(new Rational(5, 3))).printRational();;
    }
}
