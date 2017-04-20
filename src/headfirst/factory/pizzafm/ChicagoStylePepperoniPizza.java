package headfirst.factory.pizzafm; 

public class ChicagoStylePepperoniPizza extends Pizza {
  
   public ChicagoStylePepperoniPizza() {
     name = "Chicago Style Pepperoni Pizza";
     //dough = "Thin Crust Dough";
     //sauce = "Marinara Sauce";
     toppings.add("Shredded Mozzarella Cheese");
     toppings.add("Black Olives");
     toppings.add("Spinach");
     toppings.add("Eggplant");
     toppings.add("Sliced Pepperoni");
   }
}