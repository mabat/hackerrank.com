package java_learning;
import java.io.*;
import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        StringTokenizer st = new StringTokenizer(s, " !,?._'@");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }
    }
}
/*
https://www.hackerrank.com/challenges/java-string-tokens
input: He is a very very good boy, isn't he?
http://howtodoinjava.com/core-java/string-class/4-ways-to-split-tokenize-strings-in-java/
*/