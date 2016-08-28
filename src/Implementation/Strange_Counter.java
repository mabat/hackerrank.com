package Implementation;
import java.util.*;

public class Strange_Counter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        in.close();

        long sc = 3;
        long temp = sc;
        
        //naći u kojem je strange counter bloku traženi broj i countat(temp) 
        //vrijednost onoliko koliko ima od 1 kraja toga bloka
        //oduzet t od kraja bloka i to je tražena, paralelna vrijdnost
        while (temp < t) { 
            sc = sc*2;
            temp+=sc;
        }
        System.out.println((temp-t)+1);
    }
}
