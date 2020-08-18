package Design_Pattern.a_Creational.b_Builder.b_telescoping;

public class App {
    public static void main(String[] args) {

        LunchOrder lunchOrder = new LunchOrder("Wheat","Lettuce", "Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondimants());
        System.out.println(lunchOrder.getMeat());

    }
}
