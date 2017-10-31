package lecture02;

public class Fraction {
	private int numerator;
	private int denominator;

	Fraction(int numerator, int denominator) {
		int gcd = greatestCommonDivisor(numerator, denominator);
		this.numerator = numerator / gcd;
		this.denominator = denominator / gcd;
	}

	@Override
	public String toString() {
		return (numerator + "/" +denominator);
	}

	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Object) == false) return false;
		Fraction f = (Fraction)obj;
		return this.numerator == f.numerator && this.denominator == f.denominator;
	}

	public static Fraction add(Fraction f1, Fraction f2) {
		int den = f1.denominator * f2.denominator;
		int num = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
		return new Fraction(num, den);
	}

	public static Fraction subtract(Fraction f1, Fraction f2) {
		int den = f1.denominator * f2.denominator;
		int num = (f1.numerator * f2.denominator) - (f2.numerator * f1.denominator);
		return new Fraction(num, den);
	}

	public static Fraction multiply(Fraction f1, Fraction f2) {
		int den = f1.denominator * f1.denominator;
		int num = f1.numerator * f1.numerator;
		return new Fraction(num, den);
	}

	public static Fraction divide(Fraction f1, Fraction f2) {
		int num = f1.denominator * f2.numerator;
		int den = f1.numerator * f2.denominator;
		return new Fraction(num, den);
	}

	public static int greatestCommonDivisor(int x, int y) {
		return y == 0 ? x : greatestCommonDivisor(y, x % y);
	}

	public static void main(String[] argv) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 3);
		System.out.printf("%s ＋ %s = %s\n", f1, f2, Fraction.add(f1, f2));
		System.out.printf("%s － %s = %s\n", f1, f2, Fraction.subtract(f1, f2));
		System.out.printf("%s × %s = %s\n", f1, f2, Fraction.multiply(f1, f2));
		System.out.printf("%s ÷ %s = %s\n", f1, f2, Fraction.divide(f1, f2));
		System.out.println(Fraction.add(f1, f2).equals(new Fraction(5, 6)));
	}
}
