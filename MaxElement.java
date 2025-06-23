import java.util.*;
public class MaxElement {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the length of array: ");
        int a = in.nextInt();
        int []arr= new int[a];
        int max = arr[0];
        System.out.println("Enter the elements : ");
        for (int i =0; i<a;i++){
            arr[i]=in.nextInt();
        }
        for (int i =0; i<a; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Maximum element : "+max);
    }
}
