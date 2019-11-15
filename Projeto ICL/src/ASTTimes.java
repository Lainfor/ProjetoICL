import java.util.List;

public class ASTTimes  implements ASTNode {

	public ASTNode left;
	public ASTNode right;
	
	public ASTTimes(ASTNode newLeft, ASTNode newRight) {
		left = newLeft;
		right = newRight;
	}
	
	/*@Override
	public int eval() {
		int v1 = left.eval();
		int v2 = right.eval();
		return v1*v2;
	}*/

	@Override
	public int eval(Environment e) {
		int v1 = left.eval(e);
		int v2 = right.eval(e);
		return v1*v2;
	}

	@Override
	public void compile(Environment e, List<String> code) {
		// TODO Auto-generated method stub
		//code.add("	imul " + eval(e));
		code.add("	sipush " + left.eval(e));
		code.add("	sipush " + right.eval(e));
		code.add("	imul ");
	}

}
