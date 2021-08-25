package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/25/21 - 8:51 AM
 */
public class QuestionFourDemo {
    public static int reverse(int n) {
        boolean isNeg = n < 0;
        if (isNeg) n = -n;
        if (n==0) return 0;
        int reverseNum = 0;
        while (n >= 1) {
            reverseNum = reverseNum * 10 + (n % 10);
            n /= 10;
        }
        return isNeg ? -reverseNum : reverseNum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-11223));
    }

}
