package Strings;

import java.util.*;

public class Mars_Exploration {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int wrong = 0;
        for (int i = 0; i<S.length(); i = i+3){
            
            if (S.charAt(i) != 'S'){
                wrong++;
            }
            if (S.charAt(i+1) != 'O'){
                wrong++;
            }
            if (S.charAt(i+2) != 'S'){
                wrong++;
            }
        }
        System.out.println(wrong);
    }
}
