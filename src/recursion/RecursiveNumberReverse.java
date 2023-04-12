package recursion;

/**
 * @author : bijay.thapa
 * @created : 4/11/23, Tuesday
 * @Description :
 **/
public class RecursiveNumberReverse {
    private static int sum = 0;

    public static void main(String[] args) {
        reverse(2143);
        System.out.println("Reverse of the given number is : " + sum);
        System.out.println("Reverse of the giver number is : " + reverseTwo(314265));
    }

    private static void reverse(int number) {
        if (number == 0) return;
        int rem = number % 10;
        sum = sum * 10 + rem;
        reverse(number / 10);
    }

    private static int reverseTwo(int num) {
        // sometimes we might need some additional argument to the function
        // in that case, make a new helper function.
        int digits = (int) (Math.log10(num)) + 1;
        return helper(num, digits);
    }

    private static int helper(int num, int digits) {
        if (num % 10 == num) return num;
        int rem = num % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(num / 10, digits - 1);
    }
}
