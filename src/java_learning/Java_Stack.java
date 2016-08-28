package java_learning;

import java.util.Scanner;
import java.util.Stack;

public class Java_Stack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            char[] brackets = input.toCharArray(); //string to char array
            Stack<Character> left = new Stack<>();
            boolean flag = false; 

            for (char c : brackets) {

                if (c == '{' || c == '[' || c == '(') {

                    left.push(c);

                } else if (left.isEmpty()) { //turn flag to true if we break loop. It means that there is more unmatching elements

                    flag = true;
                    break;

                } else if (c == '}' && left.lastElement() == '{' || c == ']' && left.lastElement() == '[' || c == ')' && left.lastElement() == '(') {

                    left.pop(); //if match than remove last element
                }
            }

            if (left.isEmpty() && flag == false) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }
}
