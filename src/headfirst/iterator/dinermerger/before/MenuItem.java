package headfirst.iterator.dinermerger.before;

public class MenuItem{  // ������ ���̴�
  String name;
  String descritpion;
  boolean vegetarian;
  double price;
  public MenuItem(String n, String d, boolean v, double p){
    this.name = n;
    this.descritpion = d;
    this.vegetarian = v;
    this.price = p;
  }
  public String getName(){
    return name;
  }
  public String getDescritpion(){
    return descritpion;
  }
  public boolean isVegetarian(){
    return vegetarian;
  }
  public double getPrice(){
    return price;
  }
  public String toString(){
    return ("Name : " + name + "\nPrice : $ " + price +"\nDescription : "+ descritpion);
  }
}