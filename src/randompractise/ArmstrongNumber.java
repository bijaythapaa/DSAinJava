package randompractise;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/27/21 - 7:27 AM
 */
public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int lastDigit = 0, cubeValue = 0;
        int flag = n;
        while (flag > 0) {
            lastDigit = flag % 10;
            cubeValue = cubeValue + (lastDigit * lastDigit * lastDigit);
            flag /= 10;
        }
        return cubeValue == n;
    }

    public static void main(String[] args) {
//        int n = 153;
        for (int i = 1; i < 500; i++) {
            if (isArmstrong(i)) System.out.println(i);
        }
    }
}
