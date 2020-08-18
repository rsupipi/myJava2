package _09_Regex.e_replace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_replaceDateFormat {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("/");
        Matcher matcher = pattern.matcher("12/21/18");
        System.out.println(matcher.replaceAll("-"));

        Matcher matcher1 = pattern.matcher("12/21/18");
        System.out.println(matcher1.replaceFirst("-"));
    }
}
/*12-21-18*/
