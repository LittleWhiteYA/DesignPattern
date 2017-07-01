package iterator;

public class MenuTestDrive {
	
	public static void main(String[] args) {
//		PancakeHouseMenu ph_menu = new PancakeHouseMenu();
//		DinerMenu diner_menu = new DinerMenu();
		PancakeHouseMenu ph_menu = new PancakeHouseMenu();
		DinerMenu diner_menu = new DinerMenu();
		CafeMenu cafe_menu = new CafeMenu();
		
		Waitress waitress = new Waitress(ph_menu, diner_menu, cafe_menu);
		
		waitress.printMenu();
	}
}
