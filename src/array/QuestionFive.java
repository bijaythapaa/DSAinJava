package array;

import java.util.Arrays;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/25/21 - 5:15 PM
 */
public class QuestionFive {
    public static int[] f(int[] first, int[] last) {
        if (first == null || last == null) return null;
        if (first.length == 0 || last.length == 0) return new int[0];
        int min = (first.length < last.length) ? first.length : last.length;
        int[] newChar = new int[]{};
        int[] a, b;
        if (min == first.length) {
            a = first;
            b = last;
        } else {
            a = last;
            b = first;
        }
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    newChar[k] = a[i];
                    k++;
                }
            }
        }
/*
    we need this for loop, since we initialize newChar array with min length,
    and if only 2 values are common, then there will be extra indexes with 0 value in array.
    so, we initialize new array with the size 'k' i.e. incremented as the common values found in array.
    and then copy only the common values from array neglecting other 0 indexes.
*/
        int[] retArray = new int[k];
        for (int i = 0; i < retArray.length; i++) {
            retArray[i] = newChar[i];
        }
        return newChar;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 8, 3, 2};
        int[] b = new int[]{4, 2, 6, 1};
        System.out.println(Arrays.toString(f(a, b)));
    }
}
