package java_learning;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        int i = 0;
        while (len > 0) {
            arr[i] = scan.nextInt();
            i++;
            len--;
        }
        
        int swaps = 0;
        int sorted = 0;
        while (sorted != arr.length-1){
            sorted = 0;
            for (int j = arr.length-1; j>0; --j){
                int temp = 0;
                if (arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaps++;
                }else{
                    sorted++;
                }
            }
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);
    }
}
