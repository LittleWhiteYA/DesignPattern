package singleton;

import java.util.ArrayList;


public class Hello {

	public static void main(String[] args){
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		s1.a = 20;
		System.out.println(s1);
		System.out.println(s2.a);
		
		ArrayList<String> str = new ArrayList<>();
		str.add("a");
		str.add("b");
		System.out.println(str.size());
		str.clear();
		System.out.println(str.size());

	}
}
