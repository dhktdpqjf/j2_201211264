package headfirst.factory.pizzas;

public class CheesePizza extends Pizza{ //prepare()���� �Լ��� overriding �� ��.
                       //overriding�Ϸ��� Pizza�� �մ� �޼ҵ带 abstract�� �ؾ� �Ǵϱ�.
  public CheesePizza() {
    name = "Cheese Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Mozzarella");
    toppings.add("Parmaesan");
  }
}
  