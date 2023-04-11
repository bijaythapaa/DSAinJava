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
    }

    private static void reverse(int number) {
        if (number == 0) return;
        int rem = number % 10;
        sum = sum * 10 + rem;
        reverse(number / 10);
    }
}
