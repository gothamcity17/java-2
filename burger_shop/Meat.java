package burger_shop;

public class Meat {
    private String name;

    public static final Meat beef = new Meat("Beef");
    public static final Meat chicken = new Meat("Chicken");
    public static final Meat steak = new Meat("Steak");

    private Meat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}