import java.util.*;
public class vaccinedistproblem {



        public static void main(String[] args) throws java.lang.Exception {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt(); // number of test cases

            for (int i = 0; i < t; i++) {
                int N = in.nextInt(); // number of people
                int D = in.nextInt(); // max per day
                int[] arr = new int[N];

                int atrisk = 0;
                int norisk = 0;

                for (int j = 0; j < N; j++) {
                    arr[j] = in.nextInt();
                    if (arr[j] >= 80 || arr[j] <= 9) {
                        atrisk++;
                    } else {
                        norisk++;
                    }
                }

                // Calculate number of days needed for each group
                int days = (int) Math.ceil(atrisk * 1.0 / D) + (int) Math.ceil(norisk * 1.0 / D);
                System.out.println(days);
            }
        }
    }


