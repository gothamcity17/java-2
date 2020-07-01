package burger_shop;

public class Bread {
    private String name;

    public static final Bread white = new Bread("White");
    public static final Bread wheat = new Bread("Whole Wheat");
    public static final Bread grain = new Bread("Whole Grain");

    private Bread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
