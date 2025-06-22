import java.util.*;
public class GFGRoofTop {

    public static void main(String args[]){
        // Your code here
         Scanner in= new Scanner(System.in);
        int e=in.nextInt();

        int []arr=new int[e];
        for(int i =0;i<e ;i++){
            arr[i]=in.nextInt();
    }

        int count =0;
        int max=0;
        for(int i =0;i<arr.length-1;i++){

            if (arr[i]<arr[i+1]){
                count++;
                max= Math.max(max,count);
            }
            else{
                count=0;
            }


        }
        System.out.print(max);
    }
}
