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

    private static int search(int[] array, int target, int start, int end) {
//        int s = 0, e = array.length - 1;
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) return mid;
        if (target < array[mid]) return search(array, target, start, mid - 1);
        return search(array, target, m + 1, end);
    }
}
