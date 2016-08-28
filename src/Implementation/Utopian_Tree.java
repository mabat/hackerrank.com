package Implementation;

import java.util.*;

public class Utopian_Tree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int[] tree = new int[cases];

        for (int i = 0; i < tree.length; ++i) {

            tree[i] = scan.nextInt();
            int temp = tree[i];
            tree[i] = 1;
            int j = 1;
            while (j <= temp) {

                if (j % 2 != 0 || j == 1) {

                    tree[i] *= 2;

                } else if (j % 2 == 0) {
                    tree[i] += 1;
                }
                j++;
            }
        }
        for (int k = 0; k < tree.length; ++k) {

            System.out.println(tree[k]);
        }
    }
}
