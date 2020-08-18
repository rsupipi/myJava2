package _9_Regex.a_stringClass;

public class A_Octal_escape_sequence {
    public static void main(String[] args) {

        char c1 = '\52';
        char c2 = '\141';
        //char c3 = '\400'; // A compile-time error. Octal 400 is out of range
        char c3 = '\42';
        char c4 = '\10';  // Same as '\n'

        System.out.println(c1); // *
        System.out.println(c2); // a

        System.out.println(c3); // "
        System.out.println(c4); // Same as '\n'
    }
}
