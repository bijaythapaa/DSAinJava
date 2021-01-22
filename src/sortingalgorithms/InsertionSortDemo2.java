package sortingalgorithms;

import java.util.Scanner;

public class InsertionSortDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values: (7 elements only)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your inserted values are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > x; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = x;
        }
        System.out.println("\nYour Sorted Values are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
