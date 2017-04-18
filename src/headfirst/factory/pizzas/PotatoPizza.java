package headfirst.factory.pizzas;

public class PotatoPizza extends Pizza{
  public PotatoPizza(){
    name = "Potato Pizza";
    dough = "Sweet Potato Crust";
    sauce = "Tomato Sauce";
    toppings.add("Mozzarella");
    toppings.add("Parmaesan");
  }
}