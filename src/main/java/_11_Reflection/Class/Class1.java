package _11_Reflection.Class;


public class Class1 {
    public static void main(String[] args) {
        /**
         * Getting reference of class object
         */

        String s1 = "Hello";
        System.out.println(s1.getClass()); //class java.lang.Strin

        String s2 = "world";
        System.out.println(s2.getClass()); //class java.lang.Strin

// ---------------------------------------------------------------------------------------------------------------------

        Class<?> cls1 = "Hello".getClass();
//        Class<String> cls2 = "Hello".getClass();  // error
//        Class<Object> cls3 = "Hello".getClass();  // error

        Class<? extends String> cls4 = "Hello".getClass();
        Class<? extends Object> cls5 = "Hello".getClass();

// ---------------------------------------------------------------------------------------------------------------------

        Class<?> cls6 = String.class; /*get a class object from known class*/
        System.out.println(cls6); //class java.lang.String


        String s7 = "test"; /*name of a class*/
//
//
        try {
            Class<?> cls7 = Class.forName(s7);
            System.out.println(cls7);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

// ---------------------------------------------------------------------------------------------------------------------
        /**
         *  Get Class instance
         * 1. from an object
         * 2. from a known class
         * 3. from the name of class
         */

        try {

            Class<?> c1 = "Hello".getClass();
            Class<?> c2 = String.class;
            Class<?> c3 = Class.forName("java.lang.String");
            System.out.println(c1 + " : " + c2 + " : " + c3); //class java.lang.String : class java.lang.String : class java.lang.String

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


//        Class<?> cls6 = ;
//        System.out.println(s2.getClass());

    }
}
