package headfirst.factory.pizzas;

public class SimplePizzaFactory{
  public Pizza createPizza(String type){
    Pizza pizza= null; //cmd���� �� ���� null�� �ʱ�ȭ �� �ص� ��
    if(type.equals("cheese")){ //�ĺ��� �� ���� �ҹ��ڷ� �ٲٴ��� �ؼ� �ĺ��ϰ� �ϴ� �� better
      pizza = new CheesePizza();
    }
    return pizza; //return�� if�� �ȿ� ���� �� �� ����. return�� �Լ� �ȿ� ������ ���� �� ����.
  }
}