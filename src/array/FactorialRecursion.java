package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/26/21 - 7:25 AM
 */
public class FactorialRecursion {

    public static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        else return n * factorial(n - 1);
//        return factorial(n) * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
