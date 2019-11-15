import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class Compiler {
	
	private boolean result;
	
	public Compiler() {
		result = false;
	}
	
	public boolean compileCode(Environment e, ASTNode code) {
		int res = code.eval(e);
		if(res != 0) {
			setCompiler(true);
			return result;
		}
		setCompiler(false);
		return result;
	}
	
	public boolean getCompiler() {
		return result;
	}
	
	public void setCompiler(boolean newRes) {
		result = newRes;
	}
	
	public void printFile(List<String> code) {
		try {
			PrintWriter writer = new PrintWriter("test.j", "UTF-8");
			for(String line: code) {
				writer.println(line);
			}
			writer.close();
		}catch(FileNotFoundException e) {
			System.out.println("Syntax Error!");
		}catch(UnsupportedEncodingException e) {
			System.out.println("Syntax Error!");
		}
	}
}
