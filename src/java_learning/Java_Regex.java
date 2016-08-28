package java_learning;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Java_Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern)); //poziva klasu myRegex koja se nalazi tu u istom package-u

        }
    }
}

