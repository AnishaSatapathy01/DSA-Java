import java.util.*;
public class BubbleSortoptimized {
    public static void printArr(int []arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int temp;
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        for (int j = 0; j < a-1; j++) { //outer loop

            for (int k = 0; k < a - j - 1; k++) { //inner loop
                //to not iterate already sorted elements
                if (arr[k] > arr[k + 1]) {
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;

                }

            }
            printArr(arr);
        }
    }
}
