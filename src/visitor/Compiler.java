package visitor;

public class Compiler {

	I_Visitor nodevisitor = new NodeVisitor();
	public void compile(Node node){
		node.accept(nodevisitor);
	}
}
