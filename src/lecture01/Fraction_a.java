package lecture01;

public class Fraction_a {
	private int numerator;
	private int denominator;

	Fraction_a(int numerator, int denominator) {
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
		Fraction_a f = (Fraction_a)obj;
		return this.numerator == f.numerator && this.denominator == f.denominator;
	}

	public static Fraction_a add(Fraction_a f1, Fraction_a f2) {
		int den = f1.denominator * f2.denominator;
		int num = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
		return new Fraction_a(num, den);
	}

	public static Fraction_a subtract(Fraction_a f1, Fraction_a f2) {
		int den = f1.denominator * f2.denominator;
		int num = (f1.numerator * f2.denominator) - (f2.numerator * f1.denominator);
		return new Fraction_a(num, den);
	}

	public static Fraction_a multiply(Fraction_a f1, Fraction_a f2) {
		int den = f1.denominator * f1.denominator;
		int num = f1.numerator * f1.numerator;
		return new Fraction_a(num, den);
	}

	public static Fraction_a divide(Fraction_a f1, Fraction_a f2) {
		int num = f1.denominator * f2.numerator;
		int den = f1.numerator * f2.denominator;
		return new Fraction_a(num, den);
	}

	public static int greatestCommonDivisor(int x, int y) {
		return y == 0 ? x : greatestCommonDivisor(y, x % y);
	}

	public static void main(String[] argv) {
		Fraction_a f1 = new Fraction_a(1, 2);
		Fraction_a f2 = new Fraction_a(1, 3);
		System.out.printf("%s ＋ %s = %s\n", f1, f2, Fraction_a.add(f1, f2));
		System.out.printf("%s － %s = %s\n", f1, f2, Fraction_a.subtract(f1, f2));
		System.out.printf("%s × %s = %s\n", f1, f2, Fraction_a.multiply(f1, f2));
		System.out.printf("%s ÷ %s = %s\n", f1, f2, Fraction_a.divide(f1, f2));
		System.out.println(Fraction_a.add(f1, f2).equals(new Fraction_a(5, 6)));
	}
}
