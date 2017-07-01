package factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
	
	void prepare(){
		System.out.println("Preparing: "+name);
		System.out.println("Tossing dough: "+dough);
		System.out.println("Adding Toppings: ");
		for(int i=0; i<toppings.size(); ++i)
			System.out.println(toppings.get(i));
	}
	
	void bake(){
		System.out.println("Baking!");
	}
	void cut(){
		System.out.println("Cut Cut!");
	}
	void box(){
		System.out.println("Boxing");
	}
}
