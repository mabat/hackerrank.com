package java_learning;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Java_List {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        List<Integer> lista = new LinkedList<>();
        for (int i = 0; i < len; ++i) {
            lista.add(scan.nextInt());
        }
        int queries = scan.nextInt();
        while (queries > 0) {
            scan.nextLine();
            String input = scan.nextLine();
            if (input.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();//insert y to index x

                lista.add(x, y);

            } else if (input.equals("Delete")) {

                int x = scan.nextInt();

                lista.remove(x);
            }
            queries--;
        }
        for (Integer li : lista) {
            System.out.print(li + " ");
        }

    }

}
