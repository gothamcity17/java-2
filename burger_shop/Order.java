package burger_shop;

import java.util.*;

public class Order {

    private Burger burger;
    private String bread;
    private String meat;
    private Meal meal;
    private Side side;
    private Drink drink;
    private final ArrayList<Toppings> toppingsList;

    public Order(Burger burger, String bread, String meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
    }

    public Order(Meal meal) {
        this.meal = meal;
    }

    public Order(Side side) {
        this.side = side;
    }

    public Order(Drink drink) {
        this.drink = drink;
    }

    public void addToppings(Toppings... added) {
        for (Toppings t : added) {
            Toppings.add(t);
            System.out.println("Topping " + t + " was added.");
        }
    }

    public void purchaseOrder() {
        System.out.println("Thank you!");
    }
}