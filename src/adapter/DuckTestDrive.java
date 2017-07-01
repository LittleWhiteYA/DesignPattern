package adapter;

public class DuckTestDrive {

	public static void main(String[] args){
		Duck_A duckA = new Duck_A();
		Turkey_A turkeyA = new Turkey_A();
		Duck Turkey_to_Duck = new TurkeyAdapter(turkeyA);
		
		turkeyA.gobble();
		turkeyA.fly();
		
		testDuck(duckA);
		testDuck(Turkey_to_Duck);
		
		
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
