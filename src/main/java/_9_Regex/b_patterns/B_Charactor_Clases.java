package _9_Regex.b_patterns;

import java.util.regex.Pattern;

public class B_Charactor_Clases {
    public static void main(String args[]) {

        // a, b, or c
        System.out.println(Pattern.matches("[abc]", "adf")); //f ()
        System.out.println(Pattern.matches("[abc]", "cab")); //f ()
        System.out.println(Pattern.matches("[abc]", "a")); //true (among a or m or n)
        System.out.println(Pattern.matches("[abc]", "c")); //true (among a or m or n)
        System.out.println(Pattern.matches("[abc]", "aabc")); //false (m and a comes more than once)

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");

        //Any character except a, b, or c
        System.out.println(Pattern.matches("[^abc]", "efg")); //f ()
        System.out.println(Pattern.matches("[^abc]", "cab")); //f ()
        System.out.println(Pattern.matches("[^abc]", "a")); //f ()
        System.out.println(Pattern.matches("[^abc]", "e")); //t ()
        System.out.println(Pattern.matches("[^abc]", "aabc")); //f ()
        System.out.println(Pattern.matches("[^abc]", "aabbcc")); //f ()
    }
}
