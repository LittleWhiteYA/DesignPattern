package compound;

public class Quackist implements I_Observer {

	public void update(I_QuackObservable duck){
		System.out.println("Quackist: "+duck+" just quacked");
	}
}
