package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/23/21 - 5:36 PM
 */

/*
Q1. An array with an odd number of elements is said to be centered if all elements (except the middle one)
 are strictly greater than the value of the middle element.
 Note that only arrays with an odd number of elements have a middle element.
 Write a function that accepts an integer array and returns 1 if it is a centered array,
 otherwise it returns 0.
 */

public class QuestionOne {
    public static int centeredArray(int[] arr) {
        if (arr == null || arr.length % 2 == 0) return 0;
        int k = arr.length / 2;
        int m = arr[k];
        for (int i = 0; i < arr.length; i++) {
            if (i != k && m >= arr[i]) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        char[] a = new char[]{'a', 'b', 'c'};

        int[] arr = new int[]{};
        System.out.println(centeredArray(arr));
    }
}
