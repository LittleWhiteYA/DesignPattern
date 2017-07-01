package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList<>();
		
		addItem("1.Pancake Breakfast","Just Pancake", true, 2.99);
	}
	
	public void addItem(String name, String description,
						boolean vegetarian, double price) {
		MenuItem menu_item = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menu_item);
	}
	
//	public ArrayList<MenuItem> getMenuItems(){
//		return menuItems;
//	}
	
//	public Iterator createIterator(){
//		return new PancakeHouseMenuIterator(menuItems);
//	}
	
	public Iterator<MenuItem> createIterator(){
		return menuItems.iterator();
	}
}
