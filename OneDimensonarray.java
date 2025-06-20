import java.util.*;
public class OneDimensonarray {
    public static void main (String []args){
      Scanner hue = new Scanner (System.in);
        System.out.print("Enter number of elements : ");
        int a =hue.nextInt();
      int []arr= new int[a];

      for (int i =0; i<a; i++)
      {
          arr[i]= hue.nextInt();
      }
        for (int i =0; i<a; i++)
        {
            System.out.print("["+arr[i]+"]");
        }

    }
}
