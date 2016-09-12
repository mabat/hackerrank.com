package Search;

import java.util.*;

public class Sherlock_and_Array {

    public static String solution(int[] arr) {
        
        if (arr.length==1){
            return "YES";
        }
        
        int sum1 = 0;
        int sum2 = 0;
        int l= arr[0];
        int r = 0;
        
        for (int i = 2; i<arr.length; ++i){
            r+=arr[i];
        }
        for (int j = 1; j<arr.length-1; ++j){
            if (r == l){
                return "YES";
            }
            l+=arr[j];
            r-=arr[j+1];
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        while (cases > 0) {
            int len = scan.nextInt();
            int[] arr = new int[len];
            for (int a = 0; a < arr.length; ++a) {
                arr[a] = scan.nextInt();
            }
            String s = solution(arr);
            System.out.println(s);
            cases--;
        }
    }
}
/*
2
3
1 2 3
4
1 2 3 3
 */
