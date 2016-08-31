package java_learning;

import java.util.*;

public class Linked_List {

    public static void display(Node head) {

        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static Node insert(Node head, int data) {

        if (head == null) {
            return new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
            return head;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
/*
4
2
3
4
1
2 3 4 1
*/