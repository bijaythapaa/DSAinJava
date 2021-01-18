package sortingAlgorithms;

import java.util.Scanner;

public class InsertionSortDemo1 {

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
            int j = i;
            while (j > 0 && arr[j] > arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j = j - 1;
            }
        }
        System.out.println("\nYour Sorted Values are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
