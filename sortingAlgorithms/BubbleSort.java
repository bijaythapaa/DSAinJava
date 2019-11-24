package sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values: (7 elements only)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your inserted values are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\t");
        }

        BubbleSort bs = new BubbleSort();
        arr = bs.bubbleSort(arr);

        System.out.println(" \nYour sorted array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
            System.out.print("\t");
        }
    }

    public int[] bubbleSort(int[] x) {
        int temp = 0;
        for (int j = 0; j < x.length; j++) {
            for (int k = 0; k < x.length; k++) {
                if (x[j] < x[k]) {
                    temp = x[j];
                    x[j] = x[k];
                    x[k] = temp;
                }
            }
        }
        return x;
    }
}
