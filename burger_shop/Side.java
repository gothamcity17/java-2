package burger_shop;

public class Side {

    private String name;
    private double price;

    public Side(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static final Side curly = new Side("Curly Fries", 2.00 );
    public static final Side french = new Side("French Fries", 2.00 );
    public static final Side waffle = new Side("Waffle Fries", 2.00);
    public static final Side rings = new Side("Onion Rings", 2.50);
    public static final Side potatoes = new Side("Roasted Potatoes", 3.00);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}