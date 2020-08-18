package _09_Regex.a_stringClass;

import java.util.Arrays;

public class A_String_Class {
    public static void main(String[] args) {

        /*======= matches =======*/

        System.out.println("abcdefg".matches(".b.d.f.")); // true

        /*======= split =======*/

        System.out.println(Arrays.asList("red,green,44,3.4,blue".split(","))); //[red, green, 44, 3.4, blue]

        // splits using space
        System.out.println(Arrays.asList("red,green,44,3.4,blue".split(" "))); //[red,green,44,3.4,blue]

        //
        System.out.println(Arrays.asList("red,green,44,3.4,blue".split(""))); //[r, e, d, ,, g, r, e, e, n, ,, 4, 4, ,, 3, ., 4, ,, b, l, u, e]

        // consider whole text as one since not matching splitter
        System.out.println(Arrays.asList("red green 44 3.4 blue".split("xxx"))); //[red green 44 3.4 blue]

        // wildcard character, which is match with all characters.
        System.out.println(Arrays.asList("red green 44 3.4 blue".split("."))); //[]

        // removes the splitting character
        System.out.println(Arrays.asList("red green 44 3.4 blue".split("e"))); //[r, d gr, , n 44 3.4 blu]

        /*======= split =======*/

        // * replace -> this use character patterns not regex patterns
        System.out.println("one + one = 2".replace("one", "1")); // [1 + 1 = 2

        System.out.println("one + one = 2".replaceAll("one", "1")); // 1 + 1 = 2

        System.out.println("one + one = 2".replaceFirst("one", "1")); // 1 + one = 2

    }
}
