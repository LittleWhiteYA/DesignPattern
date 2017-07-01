package visitor;

public interface I_Visitor {

	void visitNode(AssignmentNode assignmentNode);
	void visitNode(VariableRefNode variableRefNode);
}
