package Implementation;

import java.util.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        in.close();
        boolean flag = false;

        for (int i = 0; i < Integer.MAX_VALUE; ++i) {

            if (x1 == x2) {

                flag = true;
                break;
            }
            
            x1 += v1;
            x2 += v2;

            if (x1 < 0 || x2 < 0) {
                break;
            }
        }
        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
