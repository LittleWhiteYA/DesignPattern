package visitor;

public abstract class Node implements I_Visitable {
	@Override
	public abstract void accept(I_Visitor visitor);
	public abstract void checkType();
	public abstract void generateCode();
	public abstract void printContent();
		

}
