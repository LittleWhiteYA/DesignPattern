package factory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("Cheese")){
//			pizza = new CheesePizza();
		}
		else if(type.equals("Veggie")){
//			pizza = new VeggiePizza();
		}
		
		return pizza;
	}

}
