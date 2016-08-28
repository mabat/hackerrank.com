package Warmup;

import java.util.*;

public class Time_Conversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();

        String[] time = t.split(":");

        int h = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        String sec = "" + time[2].charAt(0) + time[2].charAt(1);
        int s = Integer.parseInt(sec);
        String zone = "" + time[2].charAt(2) + time[2].charAt(3);

        if (zone.equals("PM")) {

            if (h == 12) {

                h = 12;

            } else {

                h = h + 12;
            }

            System.out.printf("%d:%s:%s%n", h, time[1], sec);

        } else if (zone.equals("AM")) {
            if (h == 12) {
                h = h - 12;
                System.out.printf("0%d:%s:%s%n", h, time[1], sec);
  
            }else{
                
            System.out.printf("%s:%s:%s%n", time[0], time[1], sec);
            }
        }
    }
}
