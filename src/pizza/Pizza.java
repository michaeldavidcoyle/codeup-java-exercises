package pizza;

/*
 * Make a Pizza class. It should have fields like pizza type (e.g., Cheese, Pepperoni, Supreme, etc.),
   size (Small, Medium, Large, and Extra Large), and crust type (Thin, Hand-tossed, Pan).
 * Include accessors and an appropriate constructor.
 * Make a PizzaShop class. This class will have your main() method for the program.
 * Write a static method in the PizzaShop class to make some pizza. The method should return an ArrayList of Pizza.
   Have the method store a few different types of pizza in the array list before returning it.
 * Next, write a printPizza method that takes an ArrayList of Pizza and prints out the pizzas in the ArrayList.
 * In your main, call makePizza and then call printPizza
 */

public class Pizza {
    private String crust;
    private String size;
    private String[] toppings;

    public Pizza(String crust, String size, String[] toppings) {
        this.crust = crust;
        this.size = size;
        this.toppings = toppings;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
}
