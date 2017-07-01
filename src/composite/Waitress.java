package composite;

public class Waitress {
	MenuComponent allMenus;
	
	Waitress(MenuComponent allMenus){
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		allMenus.print();
	}
}
