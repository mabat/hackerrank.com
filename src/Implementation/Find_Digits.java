package Implementation;

import java.util.*;

public class Find_Digits {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();
        scan.nextLine();

        while (cases > 0) {

            int num = scan.nextInt();
            int temp = num;
            int count = 0, d = 0;

            while (temp > 0) {
                d = temp % 10;
                if (d != 0 && num % d == 0) {
                    count++;
                }
                temp /= 10;
            }
            System.out.println(count);
            cases--;
        }
        scan.close();
    }

}
