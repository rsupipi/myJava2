package Design_Pattern.a_Creational.b_Builder.a_JavaBeanSetter;

public class LunchOrder {
    private String bread;
    private String meat;
    private String condiments;

    public LunchOrder() {
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getcondiments() {
        return condiments;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setcondiments(String condiments) {
        this.condiments = condiments;
    }
}
