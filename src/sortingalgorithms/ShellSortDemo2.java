package sortingalgorithms;

import java.util.Scanner;

public class ShellSortDemo2 {
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

        int i, j, gap;
        gap = arr.length / 2;
        while (gap > 0) {
            i = gap;
            while (i < arr.length) {
                int temp = arr[i];
                for (j = i; (j >= gap) && (arr[j - gap] > temp); j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
                i++;
            }
            gap = gap / 2;
        }
        System.out.println("Your sorted array is:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\t");
        }
    }
}
