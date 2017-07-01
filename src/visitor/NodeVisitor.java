package visitor;

public class NodeVisitor implements I_Visitor {

	@Override
	public void visitNode(AssignmentNode assignmentNode) {
		// TODO Auto-generated method stub
		assignmentNode.checkType();
		assignmentNode.generateCode();
		assignmentNode.printContent();
	}

	@Override
	public void visitNode(VariableRefNode variableRefNode) {
		// TODO Auto-generated method stub
		variableRefNode.checkType();
		variableRefNode.generateCode();
		variableRefNode.printContent();
	}

}
