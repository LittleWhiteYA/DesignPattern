package iterator;

import java.util.Iterator;

public class Waitress {
//	PancakeHouseMenu pancakeHouseMenu;
//	DinerMenu dinerMenu;
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
//	public Waitress(PancakeHouseMenu pancakeHouse_Menu, DinerMenu diner_Menu){
//		this.pancakeHouseMenu = pancakeHouse_Menu;
//		this.dinerMenu = diner_Menu;
//	}
	public Waitress(Menu pancakeHouse_Menu, Menu diner_Menu, Menu cafe_Menu){
		this.pancakeHouseMenu = pancakeHouse_Menu;
		this.dinerMenu = diner_Menu;
		this.cafeMenu = cafe_Menu;
	}
	
	public void printMenu(){
//		Iterator pancakeIter = pancakeHouseMenu.createIterator();
//		Iterator dinerIter = dinerMenu.createIterator();
		Iterator<MenuItem> pancakeIter = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIter = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIter = cafeMenu.createIterator();
		System.out.println("Breakfast");
		printMenu2(pancakeIter);
		System.out.println();
		System.out.println("Lunch");
		printMenu2(dinerIter);
		System.out.println();
		System.out.println("Dinner");
		printMenu2(cafeIter);		
	}
	
	private void printMenu2(Iterator<MenuItem> iter){
		while(iter.hasNext()){
//			MenuItem menuItem = (MenuItem) iter.Next();
			MenuItem menuItem = (MenuItem) iter.next();
			System.out.println("Name: "+menuItem.getName());
			System.out.println("Price: "+menuItem.getPrice());
			System.out.println("Description: "+menuItem.getDescription());
		}
	}
}
