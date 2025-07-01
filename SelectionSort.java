import java.util.*;
public class SelectionSort {
    public static void printArr(int []arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length-1; i++) {
            // selecting minimum index
            int min_index=i;
            for (int j =i+1; j<arr.length;j++){
                if (arr[j] < arr[min_index]){

                    min_index= j;
                }
                printArr(arr);
            }
            int temp = arr[i];
            arr[i]= arr[min_index];
            arr[min_index]= temp;

        }

    }
}
