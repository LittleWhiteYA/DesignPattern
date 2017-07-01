package decorator;

public class Mocha extends CondimentDecorator {
	
//	Beverage beverage;
	
	public Mocha(Beverage beverage1){
		beverage = beverage1;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
//		System.out.println(beverage.cost());
//		System.out.println(beverage.getClass().getName());	
		return 0.20 + beverage.cost();
	}
	
}
