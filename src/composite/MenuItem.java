package composite;

public class MenuItem extends MenuComponent {
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
	
	public void print(){
		
		System.out.println("Item!");
		System.out.print(" "+getName());
		if(isVegetarian()){
			System.out.print("(v)");
		}
		System.out.println(", "+getPrice());
		System.out.println("    --"+getDescription());
		
	}
}
