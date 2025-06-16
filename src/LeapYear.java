import java.util.*;
public class LeapYear
{
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        if (a % 400==0 || a % 4 ==0 && a%100 !=0)
        {
            System.out.println("Its a leap year!");
        }
        else {
            System.out.println(":/ not a leap year");
        }

    }
}