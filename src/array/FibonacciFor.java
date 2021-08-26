package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/26/21 - 8:39 AM
 */
public class FibonacciFor {
    public static void main(String[] args) {
        int prev = 0, next = 1;
        int limit = 12;
        for (int j = 0; j <= limit; j++) {
            System.out.print(prev + ", ");
            int sum = prev + next;
            prev = next;
            next = sum;
        }
    }
}
