package array;

import java.util.Scanner;

public class arrayOne {
    public static void main(String[] args) {
        int[] array = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
            System.out.print("\t");
        }
    }
}
