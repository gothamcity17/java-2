package burger_shop;

import java.util.ArrayList;

public class HealthBurger extends Burger {

    private String name;
    private Bread bread;
    private Meat meat;
    private final ArrayList<Toppings> toppingsList;
    private double price = 5.00;

    public static final HealthBurger Health = new Health("Health Burger", Bread.grain, Meat.chicken);
    
    public HealthBurger(String name, Bread bread, Meat meat) {
        super(name, meat, bread);

        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addToppings(Toppings... added) {
        if (Toppings.size() <= 4) {
            for(Toppings t : added) {
                Toppings.add(t);
                System.out.println("Topping " + t + " was added.");
            }
        } else {
            System.out.println("Maximum number of toppings reached");
        }
    }
}
