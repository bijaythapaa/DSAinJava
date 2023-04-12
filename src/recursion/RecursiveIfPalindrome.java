package recursion;

/**
 * @author : bijay.thapa
 * @created : 4/12/23, Wednesday
 * @Description :
 **/
public class RecursiveIfPalindrome {
    public static void main(String[] args) {
        System.out.println("Is Palindrome? : " + isPalindrome(1234554321));
        System.out.println("Is Palindrome? : " + isPalindrome(1234321));
        System.out.println("Is Palindrome? : " + isPalindrome(12345321));
    }

    private static int reverse(int n) {
        int degree = (int) (Math.log10(n)) + 1;
        return helper(n, degree);
    }

    private static int helper(int n, int degree) {
        if (n % 10 == n) return n;
        return (n % 10) * (int) (Math.pow(10, degree - 1)) + helper(n / 10, degree - 1);
    }

    private static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}
