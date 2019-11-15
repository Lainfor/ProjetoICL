import java.util.List;

public class ASTLet implements ASTNode {
	public String id;
	public ASTNode number;
	public ASTNode body;
	
	public ASTLet(Environment e) {
		//env = e;
	}
		
	public ASTLet(String id, ASTNode number, ASTNode body) {
		//env = e;
		this.id = id;
		this.number = number;
		this.body = body;
	}
	

	@Override
	public int eval(Environment env) {
		//return 0;
		int v1 = number.eval(env);
		
		env.beginScope();
		env.add(this.id, v1);
		
		int v2 = body.eval(env);
		
		env.endScope();
		return v2;
	}

	@Override
	public void compile(Environment e, List<String> code) {
		// TODO Auto-generated method stub
		code.add("	new f" + id);
		code.add("	dup");
		code.add("		invokeespecial f" + id + "/<init>()V");
		code.add("	dup");
		code.add("	aload 4");
		code.add("	putfield f" + id + "/sl Ljava/lang/Object;");
		code.add("	astore 4");
		number.compile(e, code);
		body.compile(e, code);
		code.add("	aload 4");
		code.add("	getfield f" + id + "/sl Lf0");
		code.add("	astore 4");
	}


	/*@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	/*int v1 = number.eval(env);
	
	env.beginScope();
	env.add(this.id, v1);
	
	int v2=body.eval(env);
	
	env.endScope();
	return v2;*/
}
