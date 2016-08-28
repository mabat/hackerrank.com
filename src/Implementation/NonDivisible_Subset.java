package Implementation;

import java.util.*;

public class NonDivisible_Subset {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, k;
        List<Integer> subset = new ArrayList<>();

        n = scan.nextInt();
        k = scan.nextInt();

        for (int i = 0; i < n; ++i) {

            subset.add(scan.nextInt());

        }
       // Collections.sort(subset);
        int l = 0;
        while (l < subset.size()) {

            for (int j = l+1; j < subset.size(); ++j) {

                if ((subset.get(l) + subset.get(j)) % k == 0) {

                    subset.remove(j);
                   
                }
            }
            l++;
        }

        System.out.println(subset.size());

    }
}/*

nije dobro
10 4
1 2 3 4 5 6 7 8 9 10
 */
