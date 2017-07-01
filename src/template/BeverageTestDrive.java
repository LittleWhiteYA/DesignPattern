package template;

public class BeverageTestDrive {

	public static void main(String[] args){
		CaffeineBeverageWithHook coffeehook = new CoffeeWithHook();
		
		System.out.println("Making Coffee...");
		coffeehook.prepareRecipe();
	}
}
