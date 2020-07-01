package burger_shop;

import java.util.ArrayList;

public class HealthBurger extends Burger {

    private String name;
    private Bread bread;
    private Meat meat;
    private double price = 5.00;
    private String[] toppings = {null, null, null, null};
    private double each;

    public static final HealthBurger Health = new Health("Health Burger", Bread.grain, Meat.chicken);
    
    public HealthBurger(String name, Bread bread, Meat meat) {
        super(name, meat, bread);

        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addToppings(String TopOne, String TopTwo) {
        String[] toppingsArray = {"Lettuce", "Tomatoes", "Cheese", "Onions", "BBQ Sauce", "Bacon"};

        for(String item: toppingsArray) {
            if(TopOne.equals(item)) {
                this.toppings[0] = item;
                this.each += 0.75;
            }
            if(TopTwo.equals(item)) {
                this.toppings[1] = item;
                this.each += 0.75;
            }
            if(TopThree.equals(item)) {
                this.toppings[2] = item;
                this.each += 0.75;
            }
            if(TopFour.equals(item)) {
                this.toppings[3] = item;
                this.each += 0.75;
            }
        }
    }

    public void getTotal() {
        double Total = each + price;
        System.out.printf("Your regular burger with %s, %s, %s, and %s will cost $%f dollars %n", this.toppings[0], this.toppings[1], this.toppings[2], this.toppings[3], Total);
    }
}
