package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/23/21 - 6:00 PM
 */

/*
Q2. Write a function that takes an array of integers as an argument and
 returns a value based on the sums of the even and odd numbers in the array.
 Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers.
 The function should return X – Y.
 */

public class QuestionTwo {

    public static int getDifference(int[] arr) {
        int l = arr.length;
        int sumEven = 0, sumOdd = 0;
        if (l == 1) {
            return arr[0];
        }
        for (int i = 0; i < l; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            }
            else {
                sumOdd += arr[i];
            }
        }
        return sumOdd - sumEven;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{};
        System.out.println(getDifference(arr));
    }
}
