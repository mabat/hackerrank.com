package Implementation;

import java.util.*;

public class Flatland_Space_Stations {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();
        int[] cities = new int[n];
        int[] stations = new int[m];

        int n_i = 0;
        while (n_i < m) {
            stations[n_i] = scan.nextInt();

            n_i++;
        }
        Arrays.sort(stations);

        int distanceL = 0;
        int distanceR = 0;
        int max = 0;
        
        //from the first city to the first station
        for (int i = 0; i < stations[0]; ++i) {

            distanceL = Math.abs(i - stations[0]);

            if (distanceL > max) {
                max = distanceL;
            }
        }
        //betwen two stations to the end
        for (int j = 0; j < stations.length - 1; ++j) {

            for (int i = stations[j]; i < stations[j + 1]; ++i) {

                distanceL = Math.abs(i - stations[j]);
                distanceR = Math.abs(i - stations[j + 1]);

                if (distanceL <= distanceR && distanceL > max) {

                    max = distanceL;

                } else if (distanceR <= distanceL && distanceR > max) {

                    max = distanceR;
                }
            }
        } 
        //from last station to the end
        for (int i = stations[stations.length - 1]; i < cities.length; ++i) {

            distanceL = Math.abs(i - stations[stations.length - 1]);

            if (distanceL > max) {
                max = distanceL;
            }
        }
        System.out.println(max);
    }
}
