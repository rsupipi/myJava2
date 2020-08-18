package Design_Pattern.a_Creational.a_Singleton.demo;

import Design_Pattern.a_Creational.a_Singleton.a_early_Instantiation.Early;
import Design_Pattern.a_Creational.a_Singleton.a_lazy_Instantiation.Lazy;

public class App {
    public static void main(String[] args) {

        /* In each time we create this it returns the same*/
        Early early = Early.getEarly();
        System.out.println(early);

        Lazy lazy = Lazy.getLazy();
        System.out.println(lazy);
    }
}
