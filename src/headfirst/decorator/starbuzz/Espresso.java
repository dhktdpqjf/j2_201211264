package headfirst.decorator.starbuzz;

public class Espresso extends Beverage{
  //String description; //�굵 ���������ϱ� ���� �� �ص� ��
  public Espresso(){
    description = "Espresso Coffee";
  }
  
/*  public String getDescription() {//overriding ���� �Ŷ� �׿��� ��
   return description;
 }*/
 
  public double cost(){
    return 1.99;
  }
}
  
