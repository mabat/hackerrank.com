package Implementation;

import java.util.*;

public class Equal_Stacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for (int h1_i = 0; h1_i < n1; h1_i++) {
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for (int h2_i = 0; h2_i < n2; h2_i++) {
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for (int h3_i = 0; h3_i < n3; h3_i++) {
            h3[h3_i] = in.nextInt();
        }
        //individual sums
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < h1.length; ++i) {
            sum1 += h1[i];
        }

        for (int j = 0; j < h2.length; ++j) {
            sum2 += h2[j];
        }

        for (int k = 0; k < h3.length; ++k) {
            sum3 += h3[k];
        }
        //subtract first element from sum of elements while array sum is 
        //greater than others
        //loop through each array separately
        int s1 = 0, s2 = 0, s3 = 0;
        while (true) {

            while (sum1 > sum2) {
                sum1 -= h1[s1];
                s1++;
            }

            while (sum2 > sum3) {

                sum2 -= h2[s2];
                s2++;
            }

            while (sum3 > sum2 || sum3 > sum1) {
                sum3 -= h3[s3];
                s3++;
            }

            if (sum1 == sum2 && sum2 == sum3) {

                break;
            }
        }
        System.out.println(sum1);
    }
}
