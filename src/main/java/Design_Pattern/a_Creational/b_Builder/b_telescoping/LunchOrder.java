package Design_Pattern.a_Creational.b_Builder.b_telescoping;

public class LunchOrder {
    private String bread;
    private String meat;
    private String condimants;

    public LunchOrder(String bread) {
        this.bread = bread;
    }

    public LunchOrder(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public LunchOrder(String bread, String meat, String condiments) {

        this.condimants = condimants;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCondimants() {
        return condimants;
    }

}
