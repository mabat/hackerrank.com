package Implementation;

import java.util.*;

public class Fair_Rations {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for (int B_i = 0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }
        
        //first number
        int count = 0;
        if (B[0] % 2 != 0) {
            B[0] += 1;
            B[1] += 1;
            count+=2;
        }
        
        //from the second number
        for (int i = 1; i < B.length - 1; ++i) {

            if (B[i] % 2 != 0) {

                B[i] += 1;
                count++;
                if (B[i - 1] % 2 != 0) {
                    B[i - 1] += 1;
                    count++;
                } else {
                    B[i + 1] += 1;
                    count++;
                }
            }
        }
        //last number
        if (B[B.length-1] % 2 != 0) {
            B[B.length-1] += 1;
            B[B.length-2] += 1;
            count+=2;
        }
        for (int i = 0; i < B.length; ++i) {

            if (B[i] % 2 != 0) {

                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println(count);
    }
}
