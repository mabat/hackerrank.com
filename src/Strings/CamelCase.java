package Strings;

import java.util.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int words = 1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'A' && s.charAt(i)<='Z') {
                words++;
            }
        }
        System.out.println(words);
    }
}
