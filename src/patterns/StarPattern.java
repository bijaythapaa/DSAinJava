package patterns;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/27/21 - 10:29 PM
 */
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
        //   print space in decreasing order
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
        //   print star in increasing order
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
