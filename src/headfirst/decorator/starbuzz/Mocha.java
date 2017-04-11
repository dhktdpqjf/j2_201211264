package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{  
  Beverage beverage; //has-a 관계를 뜻함. 블랙다이아몬드 아직 없음. 블랙다이아몬드 만들라면 생성자에다가 넣어야함
  
  public Mocha(Beverage beverage){ 
    this.beverage=beverage;//모카가 만들어지는 순간에 만들어지기 떄문에 블랙다이아몬드임.    
  }
  public String getDescription(){
    return beverage.getDescription()+" adding Mocha";// 생성자에 넣어놓고 쓰는 것과 아닌 것의 차이가 큼
  }
    public double cost(){
      return 0.20 + beverage.cost();
    }
}