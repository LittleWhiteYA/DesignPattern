package decorator;

public class Whip extends CondimentDecorator {
	
//	Beverage beverage;
	
	public Whip(Beverage beverage1){
		beverage = beverage1;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
//		System.out.println(beverage.cost());
//		System.out.println(beverage.getClass().getName());
		return 0.10 + beverage.cost();
	}
}
