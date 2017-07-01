package visitor;

public class VariableRefNode extends Node {

	@Override
	public void accept(I_Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitNode(this);
	}

	@Override
	public void checkType() {
		// TODO Auto-generated method stub
		System.out.println("VariableRefNode check type.");
	}

	@Override
	public void generateCode() {
		// TODO Auto-generated method stub
		System.out.println("VariableRefNode generate code.");
	}

	@Override
	public void printContent() {
		// TODO Auto-generated method stub
		System.out.println("VariableRefNode print content.");
	}

}
