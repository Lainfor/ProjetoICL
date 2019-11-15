import java.util.List;

public class ASTNum implements ASTNode {

	int val;
	
	public ASTNum(int newVal) {
		val = newVal;
	}
	
	@Override
	public int eval(Environment e) {
		return val;
	}

	@Override
	public void compile(Environment e, List<String> code) {
		// TODO Auto-generated method stub
		code.add("	aload 4");
		code.add("	sipush " + val);
		
	}

	/*@Override
	public int eval() {
		// TODO Auto-generated method stub
		return val;
	}*/

}
