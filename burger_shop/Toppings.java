package burger_shop;

public class Toppings {

    private String name;
    private double price;
    private boolean isHealthy;

    public Toppings(String name, double price, boolean isHealthy) {
        this.name = name;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public static final Topping lettuce = new Topping("Lettuce", 0.75, true);
    public static final Topping tomatoes = new Topping("Tomatoes", 0.75, true);
    public static final Topping cheese = new Topping("Cheese", 0.75, false);
    public static final Topping onions = new Topping("Onions", 0.75, true);
    public static final Topping bbq = new Topping("BBQ Sauce", 0.75, false);
    public static final Topping bacon = new Topping("Bacon", 0.75, false);

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getHealthy(){
        return this.isHealthy;
    }
}
