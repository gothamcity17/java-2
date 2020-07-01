package burger_shop;

public class Main {
    public static void main(String[] args) {

        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Order order = new order(Burger.Health, Bread.wheat, Meat.chicken);
        order.addToppings(Toppings.lettuce);
        order.addToppings(Toppings.tomatoes);
        order.addToppings(Toppings.onions);
        order.addSide(Side.potatoes);
        order.addDrink(Drink.water);
        order.addToppings(Topping.tomatoes);
        order.printTotal();
    }
}
