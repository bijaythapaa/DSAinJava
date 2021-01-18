package recursion;

import java.util.Scanner;

public class SimpleFibonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers you want to print: ");
        int val = sc.nextInt();
        int h = 1, l = 0, temp;
        if (val == 1)
            System.out.println(1);
//        else if (val == 2)
//            System.out.println("Your Fibonacci numbers are: " + 1 + ", " + 1);
        System.out.println("Your Fibonacci numbers are: ");
        for (int i = 0; i < val; i++) {
            temp = l;
            l = h;
            h = temp + l;
            System.out.print(h + ", ");
        }
    }
}
