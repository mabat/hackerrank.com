package Warmup;
import java.util.*;
import java.text.DecimalFormat;
public class Plus_Minus {

     public static List<String> solution(int[] num, int len){
        
        int pos = 0, neg = 0, zero = 0;
        for (int n:num){
            if(n>0){
                pos++;
            }else if(n<0){
                neg++;
            }else{
                zero++;
            }
        }
        
        double po = (double)pos/len;
        double ne = (double)neg/len;
        double ze = (double)zero/len;
        
        DecimalFormat f = new DecimalFormat("0.000000");
        String p = f.format(po);
        String n = f.format(ne);
        String z = f.format(ze);
        List<String>fractions = new ArrayList<>();
        fractions.add(p);
        fractions.add(n);
        fractions.add(z);
        return fractions;
        
    }

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int len =  scan.nextInt();
        scan.nextLine();
        int [] numbers = new int[len];
        for(int i=0; i<len; ++i){
            
            numbers[i] = scan.nextInt();
        }
        List<String> fractions = new ArrayList<>();
        
            fractions = solution (numbers, len);
            for(String f:fractions){
                System.out.println(f);
            }
            
    }
}
