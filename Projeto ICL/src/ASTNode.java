import java.util.List;

public interface ASTNode {
	//int eval();
	int eval(Environment e);
	void compile(Environment e, List<String> code);
}
