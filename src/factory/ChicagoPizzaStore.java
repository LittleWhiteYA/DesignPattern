package factory;

public class ChicagoPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String type){
		
		if(type.equals("Cheese")){
			return new ChicagoStyleCheesePizza();
		}else return null;
	}

}
