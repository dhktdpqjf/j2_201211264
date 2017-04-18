package headfirst.factory.pizzas;

public class CheesePizza extends Pizza{ //prepare()같은 함수는 overriding 안 함.
                       //overriding하려면 Pizza에 잇는 메소드를 abstract로 해야 되니까.
  public CheesePizza() {
    name = "Cheese Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Mozzarella");
    toppings.add("Parmaesan");
  }
}
  