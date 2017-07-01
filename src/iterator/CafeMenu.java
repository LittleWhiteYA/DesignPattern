package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
	Hashtable<Object, MenuItem> menuItems = new Hashtable<>();
	
	public CafeMenu(){
		addItem("Veggie Burger", "Something", true, 4.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuitem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuitem.getName(), menuitem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		// TODO Auto-generated method stub
		return menuItems.values().iterator();
	}
	
}
