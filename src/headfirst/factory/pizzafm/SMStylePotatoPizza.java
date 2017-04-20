package headfirst.factory.pizzafm; 

public class SMStylePotatoPizza extends Pizza{
  public SMStylePotatoPizza() {
     name = "SM Style Sauce and Potato Pizza";
     dough = "Thin Crust Dough";
     sauce = "Cream Sauce";
     toppings.add("Mozzarella Cheese");
     toppings.add("Parmaesan"); 
   }
}