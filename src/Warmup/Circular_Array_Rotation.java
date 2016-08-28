package Warmup;

import java.util.*;

public class Circular_Array_Rotation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, k, q;
        n = scan.nextInt();
        k = scan.nextInt();
        q = scan.nextInt();
        scan.nextLine();

        if (k > n) { //ako je broj upita veći od duljine niza

            while (k > n) { //ili k = k%n
                k = k - n;
            }
        }

        int[] arr = new int[n];
        int[] solution = new int[n];
        int[] querry = new int[q];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }
        scan.nextLine();

        for (int j = 0; j < q; ++j) {
            querry[j] = scan.nextInt();
        }
        scan.close();

        int s = 0;

        for (int t = arr.length - k; t < arr.length; ++t) { //od kverija do kraja niza
            solution[s] = arr[t];
            s++;
        }
        for (int t = 0; t < arr.length - k; ++t) { //od početka niza do kverija
            solution[s] = arr[t];
            s++;
        }

        for (int qu : querry) {

            System.out.println(solution[qu]);

        }
    }
}
/* Ovo rješenje je točno ali je N*N pa pada na performancu
   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, k, q;
        n = scan.nextInt();
        k = scan.nextInt();
        q = scan.nextInt();
        scan.nextLine();

        int[] arr = new int[n];
        int[] querry = new int[q];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }
        scan.nextLine();

        for (int j = 0; j < q; ++j) {
            querry[j] = scan.nextInt();
            //scan.nextLine();
        }
        scan.close();

        for (int l = 0; l < k; ++l) {

            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            for (int t = 1; t < arr.length; ++t) {
                int help = arr[t];
                arr[t] = temp;
                temp = help;
            }
        }
        
        for (int qu : querry){
            
            System.out.println(arr[qu]);
            
        }
    }
 */
