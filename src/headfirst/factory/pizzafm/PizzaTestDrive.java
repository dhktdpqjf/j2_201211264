package headfirst.factory.pizzafm; 

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore smStore = new SMPizzaStore();
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();    
    
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
    pizza = nyStore.orderPizza("clam");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    pizza = chicagoStore.orderPizza("clam");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
    pizza = nyStore.orderPizza("pepperoni");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    pizza = chicagoStore.orderPizza("pepperoni");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
    pizza = nyStore.orderPizza("veggie");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    pizza = chicagoStore.orderPizza("veggie");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
    
    System.out.println("-------------Finally, Let's bake SM Style Pizza-------------");
    pizza = smStore.orderPizza("potato");
    System.out.println("JH ordered a " + pizza.getName() + "\n");
  }
}