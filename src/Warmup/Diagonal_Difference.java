
package Warmup;
import java.util.*;
public class Diagonal_Difference {
      public static int solution (String [] matrix){
        
        int lsum = 0;
        int rsum = 0;
        int l=0;
        int r;
        
        String[] temp = matrix[0].split(" ");
        r=temp.length-1;
        for (int i=0; i<matrix.length;++i){
            
            String [] temp1 = matrix[i].split(" ");
                                       
            lsum += Integer.parseInt(temp1[l]);
            rsum += Integer.parseInt(temp1[r]);
           l++;
           r--;
        }
     
     return Math.abs(lsum-rsum);
        
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        scan.nextLine();
        String [] matrix = new String[len];
        
        for(int i=0; i<len; ++i){
            
            matrix[i] = scan.nextLine();
                        
        }
        System.out.println(solution(matrix));
    }   
}
