package composite;

public class MenuTestDrive {
	public static void main(String args[]){
		MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
		MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
		MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
		MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert!");
		
		MenuComponent allMenus = new Menu("All menus", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		dinerMenu.add(new MenuItem("A1", "A description", true, 3.89));
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("De1", "De1 description", true, 1.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		
	}
}
