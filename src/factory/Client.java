package factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaStore NYPizzaStore = new NYPizzaStore();
		PizzaStore ChicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza = NYPizzaStore.orderPizza("Cheese");
		ChicagoPizzaStore.orderPizza("Cheese");
		System.out.println(pizza.getClass().getName());
	}

}
