package Implementation;
import java.util.*;
public class Jumping_on_the_Clouds_Revisited {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //number of clouds
        int k = in.nextInt(); //jump distance
        in.nextLine();
        
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int E = 100;
        
        int i=0;
        while (i<n){
            
            if (c[i] == 1){
                
                E -= 3; 
                
            }else{
                E-= 1;
            }
            i += k;
        }
        System.out.println(E);       
    }
}
