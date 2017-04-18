package headfirst.factory.pizzas;
import java.util.ArrayList;

public class Pizza{
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>(); 
  //ArrayList toppings = new ArrayList(); //cmd에서 컴파일하면 Generic 지정 안 해줘도 됨.
  
  public void prepare(){
    System.out.println("preparing " +name);
  }
  public void bake(){
    System.out.println("baking " +name);
  }
  public void cut(){
    System.out.println("cutting " +name);
  }
  public void box(){
    System.out.println("boxing " +name);
  }
}