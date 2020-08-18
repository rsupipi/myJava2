package Design_Pattern.a_Creational.b_Builder.a_JavaBeanSetter;

public class App {
    public static void main(String[] args) {

        LunchOrder lunchOrder = new LunchOrder();
        lunchOrder.setBread("Wheat");
        lunchOrder.setcondiments("Lettuce");
        lunchOrder.setMeat("Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getcondiments());
        System.out.println(lunchOrder.getMeat());

    }
}
