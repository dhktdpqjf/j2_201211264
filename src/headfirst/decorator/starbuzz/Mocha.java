package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{  
  Beverage beverage; //has-a ���踦 ����. �����̾Ƹ�� ���� ����. �����̾Ƹ�� ������ �����ڿ��ٰ� �־����
  
  public Mocha(Beverage beverage){ 
    this.beverage=beverage;//��ī�� ��������� ������ ��������� ������ �����̾Ƹ����.    
  }
  public String getDescription(){
    return beverage.getDescription()+" adding Mocha";// �����ڿ� �־���� ���� �Ͱ� �ƴ� ���� ���̰� ŭ
  }
    public double cost(){
      return 0.20 + beverage.cost();
    }
}