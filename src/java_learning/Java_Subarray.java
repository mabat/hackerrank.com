package java_learning;

import java.util.*;

public class Java_Subarray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        scan.nextLine();
        int sum = 0;
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; ++i) {
            int temp = 0;

            for (int j = i; j < arr.length; ++j) {

                temp += arr[j];

                if (temp < 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
/*
https://www.hackerrank.com/challenges/java-negative-subarray
*/
