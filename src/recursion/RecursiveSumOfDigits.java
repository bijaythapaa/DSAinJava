package recursion;

/**
 * @author : bijay.thapa
 * @created : 4/11/23, Tuesday
 * @Description :
 **/
public class RecursiveSumOfDigits {
    public static void main(String[] args) {
        System.out.println("sum of digits of the given value is : " + sumOfDigits(1345));
    }

    private static int sumOfDigits(int value) {
        if (value % 10 == value) return value;
        return value % 10 + sumOfDigits(value / 10);
    }
}
