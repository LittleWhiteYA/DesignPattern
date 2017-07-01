package visitor;

public class AssignmentNode extends Node {

	@Override
	public void accept(I_Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitNode(this);
	}

	@Override
	public void checkType() {
		// TODO Auto-generated method stub
		System.out.println("AssignmentNode check type.");
	}

	@Override
	public void generateCode() {
		// TODO Auto-generated method stub
		System.out.println("AssignmentNode generate code.");
	}

	@Override
	public void printContent() {
		// TODO Auto-generated method stub
		System.out.println("AssignmentNode print content.");
	}

}
