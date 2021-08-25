package array;

import java.util.Arrays;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/23/21 - 6:24 PM
 */
public class QuestionThree {

    public static char[] validateArray(char[] arr, int start, int len) {
        if (start < 0 || len < 0 || start + len - 1 >= arr.length) {
            return null;
        }
        char[] res = new char[len];
        for (int i = start, j = 0; j < len; i++, j++) {
            res[j] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b', 'c'};
        arr = validateArray(arr, 1, 2);
//        assert arr != null;
        System.out.println(Arrays.toString(arr));
    }
}
