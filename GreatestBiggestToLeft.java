public class GreatestBiggestToLeft {
    public static void main (String args[]){
        int arr[]={7,3,2,5,6,1,3,9,4,7};
        int a =-1;

        for (int i=0; i<arr.length;i++){
            for (int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    a=arr[j];
                    break;
                }


            }
            System.out.print(a+" ");

        }


    }
}
