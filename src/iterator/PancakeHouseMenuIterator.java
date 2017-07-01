package iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	
	ArrayList<MenuItem> phMenu;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> ph_menu){
		this.phMenu = ph_menu;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= phMenu.size())
			return false;
		else
			return true;
	}

	@Override
	public Object Next() {
		// TODO Auto-generated method stub
		MenuItem ph_menu = phMenu.get(position);
		++position;
		return ph_menu;
	}

}
