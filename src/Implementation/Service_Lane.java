package Implementation;

import java.util.*;

public class Service_Lane {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] freeway = new int[n];

        for (int l = 0; l < freeway.length; ++l) {
            freeway[l] = scan.nextInt();
        }
        while (k > 0) {

            int i = scan.nextInt();
            int j = scan.nextInt();
            
            int largest = 3;
            for (int f = i; f<=j; ++f){
                if (freeway[f]< largest){
                    largest = freeway[f];
                }
            }
            System.out.println(largest);
            k--;
        }
    }
}
