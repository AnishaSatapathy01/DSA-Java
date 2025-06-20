import java.util.*;
public class CodeChefSearchArr {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in =new Scanner (System.in);

            int size=in.nextInt();
            int []arr= new int[size];
            int ele=in.nextInt();
            for(int i =0; i<size;i++){
                arr[i]=in.nextInt();

            }
            for (int i=0;i<size;i++){
                if (arr[i]==ele){
                    System.out.print("YES");
                    return;
                }
            }

            System.out.println("NO");

        }
    }


