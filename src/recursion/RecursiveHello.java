package recursion;

/**
 * @author : bijay.thapa
 * @created : 4/10/23, Monday
 * @Description :
 **/
public class RecursiveHello {
    public static void main(String[] args) {
        sayHello(5);
        System.out.println("Nth Fibonacci number is: = " + findNthFibNumber(6));
    }

    private static void sayHello(int n) {
        // base condition
        if (n == 0) return;
        System.out.println("Hello World !!");

        // recursive call
        // if you calling a function again and again, you can treat it as separate call in the stack
        // Tail Recursion : since this is the last function call.
        sayHello(n - 1);
    }

    private static int findNthFibNumber(int n) {
        if (n < 2) {
            return n;
        } else {
            return findNthFibNumber(n - 1) + findNthFibNumber(n - 2);
        }
    }
}
