package template;

public abstract class CaffeineBeverageWithHook {

	void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("Boiling Water");
	}
	
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondiments(){
		return true;
	}
	
}
