import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EnviromentImp implements Environment {
	
	//public List<Integer> vars;
	public HashMap<String, Integer> vars;
	public Environment envP; //parent enviorement
	
	public EnviromentImp() {
		envP = null;
		vars = new HashMap<>();
	}
	
	public EnviromentImp(Environment p) {
		envP = p;
		vars = new HashMap<>();
	}

	@Override
	public Environment beginScope() {
		// Criar ambiente filho
		Environment e = new EnviromentImp(this);
		return e;
	}

	@Override
	public void add(String id, int value) {
		// Adicionar let ao ambiente atual
		vars.put(id, value);
		
	}

	@Override
	public int find(String id) {
		// Devolver um let do ambiente
		Integer aux = vars.get(id);
		if(aux == null) {
			aux = envP.find(id);
		}
		return aux;
	}

	@Override
	public Environment endScope() {
		// Libertar no atual
		return envP;
	}
	
}
