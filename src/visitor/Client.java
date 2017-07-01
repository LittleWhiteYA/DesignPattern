package visitor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiler compiler = new Compiler();
		compiler.compile(new AssignmentNode());
	}

}
