package sortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
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

        SelectionSort ss = new SelectionSort();
        int[] array = ss.selectionSort(arr);

        System.out.println("\n Your sorted array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\t");
        }
    }
    public int[] selectionSort(int[] arr){
        int temp = 0;
        for (int lsi = arr.length - 1; lsi > 0; lsi--) {
            int largest = 0;
            for (int j = 1; j <= lsi; j++) {
                if (arr[j] > arr[largest]) {
                    largest = j;
                }
            }
            temp = arr[lsi];
            arr[lsi] = arr[largest];
            arr[largest] = temp;
        }
        return arr;
    }
}
