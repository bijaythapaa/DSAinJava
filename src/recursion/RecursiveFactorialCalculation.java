package recursion;

import java.util.Scanner;

public class RecursiveFactorialCalculation {

    private int recursiveFactorial(int a) {
        if (a == 0)
            return 1;
        return a * recursiveFactorial(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int val = sc.nextInt();
		System.out.println("Your Value is: " + val);
        RecursiveFactorialCalculation rfc = new RecursiveFactorialCalculation();
        if (val == 0)
            System.out.println("Factorial of " + val + " is: " + 1);
        else if (val < 0)
            System.out.println("Factorial of negative number is undefined !!");
        else
            System.out.println("Factorial of " + val + " is: " + rfc.recursiveFactorial(val));
    }
}
