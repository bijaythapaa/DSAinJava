package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/24/21 - 10:45 PM
 */
public class QuestionFour {

    public static int reverse(int n) {
        if (n == 0) return 0;
        boolean isNeg = n < 0;
        if (n < 0) n = -n;

        int lastDigit = 0, reverse = 0;
        while (n >= 1) {
            lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return isNeg ? -reverse : reverse;
//        return if (isNeg) rev * -1
    }

    public static void main(String[] args) {
        System.out.println(reverse(0));
    }

}
