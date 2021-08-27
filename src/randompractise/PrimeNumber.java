package randompractise;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/27/21 - 7:18 AM
 */
public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        if (n % 2 == 0) return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(37));
    }
}
