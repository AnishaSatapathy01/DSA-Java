import java.util.*;
public class SpiralTraverse {
    public static void main (String []args){
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the number of rows :");
        int rows= in.nextInt();
        System.out.println("Enter the number of columns :");
        int cols= in.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array");
        for (int i =0; i<rows ; i++)
        {
            for (int j =0; j<cols;j++)
            {
                arr[i][j]= in.nextInt();
            }
        }

        int srow =0;
        int erow= rows-1;
        int scol=0;
        int ecol=cols-1;
        for (int i =0; i<rows ; i++)
        {
            for (int j =0; j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        while(srow<=erow && scol<=ecol){
            //top boundary
            for (int n =scol; n<=ecol;n++){
                System.out.print(arr[srow][n]);
            }
            //right boundary
            for (int k=srow+1; k<=erow;k++){
                System.out.print(arr[k][ecol]);
            }
            //bottom boundary
            for(int l= ecol-1; l>=scol;l--){
                System.out.print(arr[erow][l]);
            }
            //left boundary
            for (int v=erow-1; v>=srow+1;v--){
                System.out.print(arr[v][scol]);
            }
            srow++; erow--; scol++; ecol--;
        }

    }
}
