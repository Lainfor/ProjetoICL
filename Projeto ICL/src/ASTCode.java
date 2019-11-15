import java.util.List;

public class ASTCode implements ASTNode{

	public String id;
	
	public ASTCode(String id) {
		this.id = id;
	}
	
	public String getCode() {
		return id;
	}
	
	@Override
	public int eval(Environment e) {
		// TODO Auto-generated method stub
		
		return e.find(id);
	}

	@Override
	public void compile(Environment e, List<String> code) {
		// TODO Auto-generated method stub
		code.add(	"sipush " + eval(e));
	}
	
	
}
