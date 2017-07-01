package iterator;

public class MenuItem {
	String name;
	String description;
	boolean Vegetarian;
	double price;
	
	public MenuItem(String name, String description,
					boolean Vegetarian, double price){
		this.name = name;
		this.description = description;
		this.Vegetarian = Vegetarian;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getPrice(){
		return price;
	}
	
	public boolean isVegetarian(){
		return Vegetarian;
	}
}
