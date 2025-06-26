import java.util.*;
public class BinarySearch {

    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int a= in.nextInt();
        int []arr=new int[a];
        System.out.println("Enter the elements: ");
        for(int i=0; i<a;i++){
            arr[i]= in.nextInt();
        }
        int start= 0;
        int end=arr.length-1;

        System.out.println("Enter the target number: ");
        int target=in.nextInt();
        while (start<=end){
            int mid= (start+end)/2;
            if (arr[mid] == target){
                System.out.println("Target at : "+ mid);
                break;
            }
            if (arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end =mid-1;
            }

        }




    }
}
