package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {

    private String name;
    private Bread bread;
    private Meat meat;
    private final ArrayList<Toppings> toppingsList;
    private double price = 4.00;

    public static final DeluxeBurger Deluxe = new Deluxe("Deluxe Burger", Bread.whole, Meat.steak);
    
    public DeluxeBurger(String name, Bread bread, Meat meat) {
        super(name, meat, bread);

        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addToppings(Toppings... added) {
        if (Toppings.size() <= 6) {
            for(Toppings t : added) {
                Toppings.add(t);
                System.out.println("Topping " + t + " was added.");
            }
        } else {
            System.out.println("Maximum number of toppings reached");
        }
    }
}
