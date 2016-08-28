package Implementation;

import java.util.*;

public class Save_the_Prisoner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        scan.nextLine();

        while (cases > 0) {

            long n = scan.nextLong(); //num of prisoners 5
            long m = scan.nextLong(); //num of sweets 2
            long S = scan.nextLong(); //num of ID 1

            if (n == 1) {

                System.out.println(n);

            } else if ((S - 1 + m) % n == 0) {

                System.out.println(n);
                
            } else { //((S - 1) + m > n)

                System.out.println(((S + m - 1)) % n);
            }
            cases--;
        }
    }
}
