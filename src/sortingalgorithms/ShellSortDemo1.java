package sortingalgorithms;

import java.util.Scanner;

public class ShellSortDemo1 {
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
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
            System.out.println("Your sorted array is:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                System.out.print("\t");
            }
        }
    }
}
