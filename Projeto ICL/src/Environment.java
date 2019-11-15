
public interface Environment {
	
	public Environment beginScope();
	public void add(String id, int value);
	public int find(String id);
	public Environment endScope();
}
