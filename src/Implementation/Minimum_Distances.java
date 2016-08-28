package Implementation;

import java.util.*;

public class Minimum_Distances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }

        int md = Integer.MAX_VALUE, temp = 0;
        boolean flag = false;
        for (int i = 0; i < A.length - 1; ++i) {

            for (int j = i + 1; j < A.length; ++j) {
                temp++;
                if (A[i] == A[j] && temp < md) {

                    md = temp;
                    temp = 0;
                    flag = true;
                }
            }
            temp = 0;
        }
        if (flag == true) {
            System.out.println(md);
        } else {
            System.out.println(-1);
        }
    }
}
