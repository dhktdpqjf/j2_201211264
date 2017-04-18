package headfirst.factory.pizzas;

public class PizzaStore{
  SimplePizzaFactory f; //eager  �����ڿ� �־ ����. lazy : �������� new�� ����
  //SimplePizzaFactory f = new SimplePizzaFactory(); 
  
  public PizzaStore(SimplePizzaFactory factory){
    this.f = factory;
  }
  public Pizza orderPizza(String type){
    //Pizza pizza = f.createPizza("cheese"); //interactions���� �̷��� �����ߴ� �Ÿ������� ���� ����
    Pizza pizza;
    pizza = f.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();    
    return pizza;
  }
}
   
   
   
   