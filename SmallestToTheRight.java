import java.util.*;
public class SmallestToTheRight {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int a=in.nextInt();
        int b=-1;
        int arr[]= new int[a];

        for (int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();

        }
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<i;j++){
                if(arr[j]<arr[i]){
                    b=arr[j];
                    break;
                }

            }
            System.out.println(b);

        }

    }
}

