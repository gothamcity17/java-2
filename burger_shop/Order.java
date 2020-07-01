package burger_shop;

public class Order {

    private Meal meal;
    private Burger burger;
    private String bread;
    private String meat;
    private Side side;
    private Drink drink;
    private double price;

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
        String[] toppingsArray = {"Lettuce", "Tomatoes", "Cheese", "Onions", "BBQ Sauce", "Bacon"};
        for(String item : toppingsArray) {
            Toppings.add(item);
            System.out.println("Topping " + item + " was added.");
        }
    }

    public void totalOrder() {
        System.out.println("Thank you!");
    }
}