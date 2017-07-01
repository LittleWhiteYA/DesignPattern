package factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type){
		
		if(type.equals("Cheese")){
			return new NYStyleCheesePizza();
		}
		else return null;
		
	}

}
