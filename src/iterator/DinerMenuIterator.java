package iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items){
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= items.length || items[position] == null){
			return false;
		}
		else
			return true;

	}
//	@Override
//	public Object Next() {
//		// TODO Auto-generated method stub
//		MenuItem menuItem = items[position];
//		++position;
//		return menuItem;
//	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = items[position];
		++position;
		return menuItem;
	}
	
	public void remove(){
		if(position <= 0){
			throw new IllegalStateException("You can't remove");
		}
		
		if(items[position-1] != null){
			for(int i=position-1; i<(items.length-1); ++i){
				items[i] = items[i+1];
			}
			items[items.length-1] = null;
		}
		
		
		
		
		
	}


}
