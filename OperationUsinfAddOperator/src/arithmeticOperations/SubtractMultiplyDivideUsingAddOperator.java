package arithmeticOperations;

public class SubtractMultiplyDivideUsingAddOperator {
	
	public static int negate(int a) {
		int neg = 0;
		int newSign = a < 0 ? 1: -1;
		while(a != 0) {
			neg += newSign;
			a += newSign;
		}
		return neg;
	}
	
	public static int minus(int a, int b) {
		return a + negate(b);
	}
	
	public static int multiply(int a, int b) {
		if(a < b) {
			return multiply(b, a); // algorithm is faster if b < a
		}
		int sum = 0;
		for(int i = abs(b); i > 0; i = minus(i, 1)) {
			sum += a;
		}
		if(b < 0) {
			sum = negate(sum);
		}
		return sum;
	}
	
	/* Return absolute value */
	public static int abs(int a) {
		if(a < 0) {
			return negate(a);
		} else {
			return a;
		}
	}
	
	public static int divide(int a, int b) {
		if(b == 0) {
			throw new java.lang.ArithmeticException("Error");
		}
		int absa = abs(a);
		int absb = abs(b);
		
		int product = 0;
		int x = 0;
		while(product + absb <= absa) { /* don't go past a */
			product += absb;
			x++;
		}
		
		if((a < 0 && b < 0) || (a > 0 && b > 0)) {
			return x;
		} else {
			return negate(x);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("5 - 2 = " + minus(5, 2));
		System.out.println("5 x 2 = " + multiply(5, 2));
		System.out.println("10 / 2 = " + divide(10, 2));
	}
}
