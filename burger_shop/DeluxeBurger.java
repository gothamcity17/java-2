package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {

    private String name;
    private Bread bread;
    private Meat meat;
    private double price = 4.00;
    private String[] toppings = {null, null, null, null, null, null};
    private double each;

    public static final DeluxeBurger Deluxe = new Deluxe("Deluxe Burger", Bread.whole, Meat.steak);
    
    public DeluxeBurger(String name, Bread bread, Meat meat) {
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
            if(TopFive.equals(item)) {
                this.toppings[4] = item;
                this.each += 0.75;
            }
            if(TopSix.equals(item)) {
                this.toppings[5] = item;
                this.each += 0.75;
            }
        }
        
    }

    public void getTotal() {
        double Total = each + price;
        System.out.printf("Your regular burger with %s, %s, %s, %s, %s, and %s will cost $%f dollars %n", this.toppings[0], this.toppings[1], this.toppings[2], this.toppings[3], this.toppings[4], this.toppings[5], Total);
    }
}
