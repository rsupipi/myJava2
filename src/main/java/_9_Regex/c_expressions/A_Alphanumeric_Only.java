package _9_Regex.c_expressions;

import java.util.regex.Pattern;

public class A_Alphanumeric_Only {
    public static void main(String args[]){

        /*Accepts alphanumeric characters only.length must be six characters long only.*/
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "32.003"));//false (. is not matched)
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "323003"));//false (. is not matched)

        /* Contains numbers only */
//        System.out.println(Pattern.matches("([^0-9]+){10}", "1758617011")); //10
//        System.out.println(Pattern.matches("([^0-9]+){10}", "17586170111")); //11
//        System.out.println(Pattern.matches("[0-9]+", "175861701a")); //a
        System.out.println(Pattern.matches("^(1)[0-9]{9}$", "1758617011.00")); //a
        System.out.println(Pattern.matches("^(1)[0-9]{9}$", "1758617011.00")); //a
        System.out.println(Pattern.matches("^(1)[0-9]{9}$", "2758617011")); //a
        System.out.println(Pattern.matches("^(1)[0-9]{9}$", "1758617011")); //a
//        System.out.println(Pattern.matches("([^0-9]+){10}", "ssaqfgdfgg")); //a
//        System.out.println(Pattern.matches("([^0-9]+){10}", "1758617011.00")); //a
    }
}
