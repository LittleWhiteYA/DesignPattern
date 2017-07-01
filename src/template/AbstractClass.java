package template;

public abstract class AbstractClass {

	final void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}
	
	abstract void primitiveOperation1();
	abstract void primitiveOperation2();
	
	final void concreteOperation(){
		//implement here
	}
	
	void hook(){
		//choose to let subclass override or not
	}
}
