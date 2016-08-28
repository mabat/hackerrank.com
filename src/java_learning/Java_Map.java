package java_learning;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Java_Map {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int entries = scan.nextInt();
        scan.nextLine();
        Map<String, Integer> phonebook = new HashMap<>();

        while (entries > 0) {

            String name = scan.next();
            int number = scan.nextInt();
            scan.nextLine();
            phonebook.put(name, number);

            entries--;
        }

        while (scan.hasNext()) {

            String queries = scan.nextLine();
            
            if (phonebook.containsKey(queries)){
                System.out.println(queries+"="+phonebook.get(queries));
            }else{
              System.out.println("Not found");
            }
        }
    }
}
