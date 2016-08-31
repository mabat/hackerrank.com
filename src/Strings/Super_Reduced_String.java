package Strings;

import java.util.*;

public class Super_Reduced_String {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        Stack<Character> unique = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            if (unique.isEmpty()) {
                unique.push(s.charAt(i));
            } else if (unique.peek() == s.charAt(i)) {
                unique.pop();
            } else {
                unique.push(s.charAt(i));
            }
        }
        if (unique.isEmpty()) {
            System.out.println("Empty String");
        } else {
            Iterator iterator = unique.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next());
            }
            System.out.println();
        }
    }
}
