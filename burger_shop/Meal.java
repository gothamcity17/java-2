package burger_shop;

import java.util.*;

public class Meal {

    private String name;
    private Burger burger;
    private Side side;
    private Drink drink;
    private double price;

    private ArrayList<Side> sideList;

    public static final Meal Regular = new Meal("Regular Meal", Burger.Regular, Side.french, Drink.coke, 6.00);
    public static final Meal Deluxe = new Meal("Deluxe Meal", Burger.Deluxe, Side.rings, Drink.tea, 8.00);
    public static final Meal Health = new Meal("Healthy Meal", Burger.Health, Side.potatoes, Drink.water, 9.50);

    private Meal(String name, Side side, Burger burger, Drink drink, double price) {
        this.name = name;
        this.burger = burger;
        this.side = side;
        this.drink = drink;
        this.price = price;
    }

    public void printMeal() {
        System.out.println("Your " + name + "includes a " + burger + " with " + side + " and a " + drink + ".");

        if (sideNum > 3) {
            System.out.println("You can only have three sides.");
        }
    }

    public String getName() {
        return name;
    }

    public Burger getBurger() {
        return burger;
    }

    public Side getSide() {
        return side;
    }

    public Drink getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }
}