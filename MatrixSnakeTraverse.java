import java.util.*;
public class MatrixSnakeTraverse {
    public static void main (String args[]){
      Scanner cu = new Scanner(System.in);
      System.out.println("Enter the number of rows:");
        int rows = cu.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = cu.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = cu.nextInt();
            }

        }
        for (int i = 0; i < rows; i++) {
            if (i%2!=0) {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else
            {
                for (int j=0; j<cols;j++){
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }

        }
    }
}
