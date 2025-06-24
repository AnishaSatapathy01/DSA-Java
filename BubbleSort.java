import java.util.*;
public class bubbleSort {
    public static void bubSort(int[] arr) {
        int b = arr.length;
        for (int i = 0; i < b-1; i++) {
            for (int j = 0; j < b-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }

            }
            printArray(arr);
        }
    }
}

public static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
public static void main (String args[]) {
    int[] arr = {6, 1, 4, 2, 8};
    System.out.println("Original Array:");
    printArray(arr);
    bubbleSort.bubSort(arr);
    System.out.println("Sorted array:");
    printArray(arr);

   }
