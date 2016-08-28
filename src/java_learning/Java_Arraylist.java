package java_learning;

import java.io.IOException;
import java.util.*;

public class Java_Arraylist {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //lines

        List<Integer[]> line = new ArrayList<>();

        while (n > 0) {

            int len = scan.nextInt(); //number of integers in line
            Integer[] num = new Integer[len];
            for (int i = 0; i < len; ++i) {
                num[i] = scan.nextInt();
            }
            line.add(num);
            n--;
        }

        int q = scan.nextInt();

        while (q > 0) {

            int x = scan.nextInt();
            int y = scan.nextInt();

            try {
                String temp = Arrays.toString(line.get(x - 1)); //x line
                temp = temp.replaceAll("\\[|\\]|,", ""); //ukloni [ ] ,
                if (temp.equals("")) {
                    throw new IOException("ERROR !");
                    // System.out.println("ERROR !");
                } else {
                    String[] temp2 = temp.split(" "); //razdvoji po spaceu
                    System.out.println(temp2[y - 1]); //y position
                }

            } catch (Exception e) {
                System.out.println("ERROR!");
            }
            q--;
        }
    }
}
