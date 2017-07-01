package singleton;

public class Singleton {

	private static Singleton uniqueInstance;
	public int a = 10;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
