package array;

import java.util.Arrays;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/24/21 - 9:59 PM
 */
public class QuestionThreeDemo {

    public static char[] f(char[] a, int start, int len) {
        if (start < 0 || len < 0 || (start + len) > a.length) {
            return null;
        }

        char[] _temp = new char[len];
        for (int i = start, j = 0; j < len; i++, j++) {
            _temp[j] = a[i];
        }
        return _temp;

            /*if (start < 0 && len < 0) {
                if (len <= a.length) {
                    if (start < a.length) {
                        int t = start + len;
                        if (t <= a.length) {
                            for (int i = start, j = 0; j < len; i++, j++) {
                                j = 0;
                                _temp[j] = a[i];
                                j++;
                            }
                            return _temp;
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }*/
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b', 'c'};
        System.out.println(Arrays.toString(f(arr, 0, 3)));
    }

}
