package recursion;

import java.util.Scanner;

public class RecursiveFibonacciNumber {
    public int rFib(int x) {
        int a, b;
        if (x <= 1) {
            return x;
        }
        a = rFib(x - 1);
        b = rFib(x - 2);
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers you want to print: ");
        int val = sc.nextInt();
        RecursiveFibonacciNumber efn = new RecursiveFibonacciNumber();
        System.out.println("Your fibonacci numbers are: ");
        for (int i = 1; i <= val; i++) {
            int k = efn.rFib(i);
            System.out.print(k + ", ");
        }
    }
}
