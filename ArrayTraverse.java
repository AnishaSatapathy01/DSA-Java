import java.util.*;
public class ArrayTraverse {
    public static void main (String args []){
        Scanner ac = new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int rows = ac.nextInt();
        System.out.println("Enter the number of columns");
        int cols = ac.nextInt();
        int [][] arr = new int[rows][cols];
        System.out.println("Enter the elements of array");
        for (int i =0; i<rows ; i++)
        {
            for (int j =0;j <cols;j++)
            {
               arr[i][j]=ac.nextInt();
            }

        }
        for (int i =0; i<rows ; i++)
        {
            for (int j =0;j <cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
