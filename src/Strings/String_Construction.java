package Strings;

import java.util.*;

public class String_Construction {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String s = in.next();
            int count = 0;
            Set <Character> unique = new HashSet<>(); //only unique elements
            for (int i = 0; i < s.length(); ++i) {
                
                unique.add(s.charAt(i));
            }
            for (int i=0; i<=unique.size();++i){
                count+=i;
            }
            System.out.println(unique.size());
        }
    }
}
