package iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "L,T,O", true, 3.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuitem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS){
			System.out.println("Sorry, Menu is full!");
		}
		else{
			menuItems[numberOfItems] = menuitem;
			numberOfItems = numberOfItems+1;
		}
	}
	
	
	public Iterator<MenuItem> createIterator(){
		Iterator<MenuItem> iterator = new DinerMenuIterator(menuItems);
		return iterator;
	}
	
	

}
