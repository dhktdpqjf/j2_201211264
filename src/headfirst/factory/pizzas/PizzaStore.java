package headfirst.factory.pizzas;

public class PizzaStore{
  SimplePizzaFactory f; //eager  생성자에 넣어서 생성. lazy : 쓸때마다 new로 생성
  //SimplePizzaFactory f = new SimplePizzaFactory(); 
  
  public PizzaStore(SimplePizzaFactory factory){
    this.f = factory;
  }
  public Pizza orderPizza(String type){
    //Pizza pizza = f.createPizza("cheese"); //interactions에서 이렇게 구현했던 거를다음과 같이 구현
    Pizza pizza;
    pizza = f.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();    
    return pizza;
  }
}
   
   
   
   