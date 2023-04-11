package recursion;

import java.util.Scanner;

public class SimpleFactorialCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int val = sc.nextInt();
        int x = 1;
        System.out.println("Your Value is: " + val);
        if (val == 0)
            System.out.println("Factorial of" + val + " is: " + x);
        else if (val < 0)
            System.out.println("Factorial of negative number is undefined !!");
        else
            for (int i = 1; i <= val; i++)
                x = x * i;
        System.out.println("Factorial of " + val + " is: " + x);
    }
}
