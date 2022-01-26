import java.util.Random;

public class LGU2 {

	static int input;
	
	public static void main( String[] args ) {
		
		Random generator = new Random();

		for(int i = 0; i < 3; i++) {
			input = generator.nextInt(30);
			System.out.println("Factorial is: " + factorial(input));
			System.out.println("Fibonacci is: " + fibonacci(input));
		}
		
	}
	
	static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1; // base case
		} else {
			return factorial(n-1)*n; // recursive call
		}
	}
	
	static int fibonacci(int n) {
		if(n == 0 || n == 1) {
			return 1; // base case
		} else {
			return fibonacci(n-1) + fibonacci(n-2); // recursive call
		}
	}
	
}
