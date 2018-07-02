package solutions;

public class Factorial {
	
	public static int Fact(int n) {
		// Base case fact 0 or 1 is 1
		if (n ==  1) {
			return 1;
		} else if(n == 0) {
			return 1;
		}
		// Recursive case: multiply n by (n - 1) factorial
		else
			return n * Fact(n - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4! is: " + Fact(4));
		System.out.println("1! is: " + Fact(1));
		System.out.println("0! is: " + Fact(0));

	}

}
