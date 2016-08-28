package Implementation;

import java.util.*;

public class Angry_Professor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();
        scan.nextLine();
        for (int c = 0; c < cases; c++) {

            int n = scan.nextInt(); //number of students
            int k = scan.nextInt(); //required students
            int count = 0; //current students
            int[] studs = new int[n];

            for (int i = 0; i < n; ++i) {

                studs[i] = scan.nextInt();
                if (studs[i] <= 0) {
                    count++;
                }
            }
            if (count >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
/*
2
4 3
-1 -3 4 2
4 2
0 -1 2 1
*/
