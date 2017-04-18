package headfirst.factory.pizzas;

public class SimplePizzaFactory{
  public Pizza createPizza(String type){
    Pizza pizza= null; //cmd에서 할 때는 null로 초기화 안 해도 됨
    if(type.equals("cheese")){ //식별할 때 전부 소문자로 바꾸던지 해서 식별하게 하는 게 better
      pizza = new CheesePizza();
    }
    return pizza; //return을 if문 안에 쓰는 건 안 좋음. return을 함수 안에 여러번 쓰면 안 좋음.
  }
}