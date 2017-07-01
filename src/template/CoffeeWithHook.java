package template;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Sugar and Milk");
	}
	
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}
		else
			return false;
	}

	private String getUserInput() {
		// TODO Auto-generated method stub
		return "y";
	}

}
