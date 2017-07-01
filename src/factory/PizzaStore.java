package factory;

public abstract class PizzaStore {
	
//	SimplePizzaFactory factory;
//	
//	public PizzaStore(SimplePizzaFactory factory){
//		this.factory = factory;
//	}
	
	public final Pizza orderPizza(String type){
		Pizza pizza;
		
//		pizza = factory.createPizza(type);
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
