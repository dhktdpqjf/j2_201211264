package headfirst.factory.pizzafm; 

public class SMPizzaStore extends PizzaStore{
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    /*if (type.equals("cheese")) {
      pizza = new SMStyleCheesePizza();
    }  else if (type.equals("pepperoni")) {
      pizza = new SMStyleVeggiePizza()
    } else if (type.equals("clam")) {
      pizza = new SMStyleClamPizza();
    } else if (type.equals("veggie")) {
      pizza = new SMStyleVeggiePizza();
    } */
    if(type.equals("potato")){
      pizza = new SMStylePotatoPizza();
    }
    return pizza;
  }
}