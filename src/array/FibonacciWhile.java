package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/26/21 - 8:14 AM
 */
public class FibonacciWhile {
    public static void main(String[] args) {
        int n = 5;
        int prev = 0, next = 1;
        int i = 0;
        while (i <= n) {
            System.out.print(prev + ", ");
            int sum = prev + next;
            prev = next;
            next = sum;
            i++;
        }
    }
}
