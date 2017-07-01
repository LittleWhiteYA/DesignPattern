package factory;

public class ChicagoStyleCheesePizza extends Pizza {
	
	ChicagoStyleCheesePizza(){
		name = "Chicago Cheese Pizza";
		dough = "Chicago dough";
		sauce = "Chicago sauce";
		
		toppings.add("Chicago Cheese");
	}
	
	void cut(){
		System.out.println("Chicago Cut!");
	}

}
