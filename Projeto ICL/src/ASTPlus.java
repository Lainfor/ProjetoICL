import java.util.List;

public class ASTPlus implements ASTNode {

	public ASTNode left;
	public ASTNode right;
	
	public ASTPlus(ASTNode newLeft, ASTNode newRight) {
		left = newLeft;
		right = newRight;
	}
	
	@Override
	public int eval(Environment e) {
		int v1 = left.eval(e);
		int v2 = right.eval(e);
		return v1+v2;
	}

	@Override
	public void compile(Environment e, List<String> code) {
		// TODO Auto-generated method stub
		//code.add("	iadd " + eval(e));
		code.add("	sipush " + left.eval(e));
		code.add("	sipush " + right.eval(e));
		code.add("	iadd ");
	}

	/*@Override
	public int eval() {
		int v1 = left.eval();
		int v2 = right.eval();
		return v1+v2;
	}*/
	
}
