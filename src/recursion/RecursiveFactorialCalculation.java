package recursion;

import java.util.Scanner;

public class RecursiveFactorialCalculation {

	public int recursiveFactorial(int a) {
		if (a == 0)
			return 1;
		return a * recursiveFactorial(a - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value: ");
		int val = sc.nextInt();
		int x = 1;
		System.out.println("Your Value is: " + val);
		RecursiveFactorialCalculation rfc = new RecursiveFactorialCalculation();
		if (val == 0)
			System.out.println("Factorial of " + val + " is: " + x);
		else if (val < 0)
			System.out.println("Factorial of negative number is undefined !!");
		else
			x = rfc.recursiveFactorial(val);
		System.out.println("Factorial of" + val + " is: " + x);

	}
}
