import java.util.*;
class Operations{
    public static void main (String args[]) {
        
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        switch (c)
        {
           case 1:
           System.out.println(a+b);
           break;
           case 2:
           System.out.println(a-b);
           break;
           case 3:
           System.out.println(a%b);
           break;
           case 4:
           System.out.println(a*b);
           break;
           default:
           System.out.println("Invalid option");

        }

    
    }
}
