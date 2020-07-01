package burger_shop;

public class Drink {

    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static final Drink coke = new Side("Coke", 1.00);
    public static final Drink sprite = new Side("Sprite", 1.00);
    public static final Drink tea = new Side("Sweet Tea", 1.50);
    public static final Drink lemonade = new Side("Lemonade", 1.50);
    public static final Drink water = new Side("Water", 1.50);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    } 
}