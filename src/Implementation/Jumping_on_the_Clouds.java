package Implementation;

import java.util.*;

public class Jumping_on_the_Clouds {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int jumps = 0;
        int i = 0;

        while (i < c.length - 1) {

            if ((c.length - i) > 2 && c[i + 2] == 0) { //pratimo da ne preskočimo veličinu niza sa provjerom ''c.length - i''
                i = i + 2;                             //pozicija mora bit najmanje dva mjesta prije kraja  
                jumps++;
                continue;
            } else if ((c.length - i) > 2 && c[i + 2] == 1 && c[i + 1] == 0) { //ako je za dva koraka 1, onda idemo samo jedan korak naprijed, inače u prethodnom koraku idemo dva naprijed
                i++;                                                           //pozicija mora bit najmanje dva mjesta prije kraja
                jumps++;
                continue;
            } else if (c.length - i == 2) { //ako smo na predzadnjoj poziciji skačemo za jedan
                i++;
                jumps++;
                continue;
            }
            if (i == c.length - 1) { //ako je i jednak duljini niza znači da smo na kraju
                break;
            }
        }
        System.out.println(jumps);
    }

}
