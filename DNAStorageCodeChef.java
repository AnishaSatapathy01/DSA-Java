import java.util.Scanner;

public class DNAStorageCodeChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            for (int i =0; i<s.length();i+=2){
                if(s.charAt(i)=='0' && s.charAt(i+1)=='0')
                {
                    System.out.print("A");
                }
                if(s.charAt(i)=='0' && s.charAt(i+1)=='1')
                {
                    System.out.print("T");
                }
                if(s.charAt(i)=='1' && s.charAt(i+1)=='0')
                {
                    System.out.print("C");
                }
                if(s.charAt(i)=='1' && s.charAt(i+1)=='1')
                {
                    System.out.print("G");
                }
            }
            System.out.println();
        }
    }
}
