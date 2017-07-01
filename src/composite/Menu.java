package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	String description;
	
	Menu(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int index){
		return (MenuComponent)menuComponents.get(index);
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void print(){
		
		System.out.println("Composite!");
		System.out.print("\nName: "+getName());
		System.out.println(", Description: "+getDescription());
		System.out.println("===========");
		
		Iterator<MenuComponent> iter = menuComponents.iterator();
		while(iter.hasNext()){
			MenuComponent menuCom = iter.next();
			menuCom.print();
		}
	}
	

}
