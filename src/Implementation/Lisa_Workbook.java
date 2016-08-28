package Implementation;

import java.util.*;

public class Lisa_Workbook {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //number of chapters
        int k = scan.nextInt();  //problems per page
        scan.nextLine();
        int[] problems = new int[n];

        int specialProblem = 0;
        int page = 1;

        for (int i = 0; i < problems.length; ++i) {

            problems[i] = scan.nextInt();
            int j = 1;
            int flag = 0; //for page counting
            while (j <= problems[i]) {
                
                if (flag == k){ //when page is full with problems limit
                    page++;
                    flag = 0;
                }
                if (j == page){ 
                    
                    specialProblem++;
                }
                j++;
                flag++;
            }
            page++;
        }
        System.out.println(specialProblem);
    }
}
