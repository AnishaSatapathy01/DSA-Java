import java.util.*;
public class TransposeOfMatrix {
    public static void main (String args []){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns");
        int cols = in.nextInt();
        int [][] arr = new int[rows][cols];
        System.out.println("Enter the elements of array");
        for (int i =0; i<rows ; i++)
        {
            for (int j =0;j <cols;j++)
            {
                arr[i][j]=in.nextInt();
            }

        }
        for (int i =0; i<rows ; i++)
        {
            for (int j =0;j <cols;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
           System.out.println();
        }

    }
}

