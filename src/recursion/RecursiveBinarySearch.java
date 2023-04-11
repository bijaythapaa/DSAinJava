package recursion;

/**
 * @author : bijay.thapa
 * @created : 4/11/23, Tuesday
 * @Description :
 **/
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 66, 88, 93, 94};
        System.out.println(search(array, 94, 0, array.length));
    }

    private static int search(int[] array, int target, int s, int e) {
//        int s = 0, e = array.length - 1;
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (array[m] == target) return m;
        if (target < array[m]) return search(array, target, s, m - 1);
        return search(array, target, m + 1, e);
    }
}
