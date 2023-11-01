package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;

	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	
	public Fraction reciprocal() {
		return new Fraction(this.denominator, this.numerator);
	}
	
	public Fraction multiply(Fraction compare) {
		return new Fraction(this.numerator * compare.numerator, this.denominator * compare.denominator);
	}
	
	public Fraction add(Fraction compare) {
		return new Fraction((this.numerator * compare.denominator) + (compare.numerator * this.denominator), this.denominator * compare.denominator);
	}
	
	public Fraction simplify() {
		for (int i = 2; i < this.denominator; i++) {
			if(this)
		}
		return new Fraction(this.numerator * compare.numerator, this.denominator * compare.denominator);
	}

	public String toString() {
		return numerator + "/" + denominator;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(2,3);
		System.out.println(f1.reciprocal());
		System.out.println(f1.multiply(f2));
		System.out.print(f1.add(f2));
	}

}
