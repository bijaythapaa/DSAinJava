package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/25/21 - 6:25 PM
 */
public class QuestionSix {

    public static int findPOE(int[] a) {
        if (a.length < 3) return -1;
//        just checking :)
//        if (a.length == 3) return a[0] == a[2] ? a[1] : -1;
        int i = 0, j = a.length - 1;
        int poe = 1;
        int leftSum = a[i], rightSum = a[j];
        for (int k = 1; k < a.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += a[i];
                poe = i + 1;
            } else {
                j--;
                rightSum += a[j];
                poe = j - 1;
            }
        }
        return leftSum == rightSum ? poe : -1;
    }

    public static void main(String[] args) {
        System.out.println(findPOE(new int[]{3, 4, 5, 10}));
    }
}
