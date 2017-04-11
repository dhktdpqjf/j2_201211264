package headfirst.decorator.starbuzz;

public class Espresso extends Beverage{
  //String description; //얘도 물려받으니까 생성 안 해도 됨
  public Espresso(){
    description = "Espresso Coffee";
  }
  
/*  public String getDescription() {//overriding 안할 거라서 죽여도 됨
   return description;
 }*/
 
  public double cost(){
    return 1.99;
  }
}
  
