package Implementation;

import java.util.*;

public class Cut_the_sticks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        List<Integer> sticks = new ArrayList<>();

        for (int i = 0; i < len; ++i) {
            sticks.add(scan.nextInt());
        }
        scan.close();

        int cut = 0;
        while (!sticks.isEmpty()) {

            int smallest = Integer.MAX_VALUE;
            for (int j = 0; j < sticks.size(); ++j) {

                if (sticks.get(j) < smallest) {

                    smallest = sticks.get(j);
                }
            }
            for (int k = 0; k < sticks.size(); ++k) {

                if (sticks.get(k) == smallest) {

                    sticks.remove(k);
                    cut++;
                    k--;

                } else {
                    sticks.set(k, sticks.get(k) - smallest);
                    cut++;
                }
            }
            System.out.println(cut);
            cut = 0;
        }
    }
}
