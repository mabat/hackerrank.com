package java_learning;

import java.util.*;
import java.io.*;

public class Queues_and_Stacks {
//palindrome

    Stack<Character> stack;
    Queue<Character> queue;

    public Queues_and_Stacks() {
        stack = new Stack<>();
        queue = new LinkedList<>();//Queue is interface
    }

    public void pushCharacter(char c) {
        stack.push(c);
    }

    public void enqueueCharacter(char c) {
        queue.add(c);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.poll(); //returns and removes element
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        Queues_and_Stacks p = new Queues_and_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
