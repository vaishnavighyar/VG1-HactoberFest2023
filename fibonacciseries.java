// Java Program to implement
// Fibonacci Series
import java.io.*;

// Driver Function
class GFG {

	// Function to return Fibonacci value
	static int Fib(int N)
	{
		if (N == 0 || N == 1)
			return N;

		return Fib(N - 1) + Fib(N - 2);
	}

	// Main function
	public static void main(String[] args)
	{
		// Factorial of 3
		System.out.println("Factorial of " + 3 + " "
						+ Fib(3));

		// Factorial of 4
		System.out.println("Factorial of " + 4 + " "
						+ Fib(4));

		// Factorial of 3
		System.out.println("Factorial of " + 5 + " "
						+ Fib(5));
	}
}
