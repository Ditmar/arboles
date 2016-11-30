
public class Nodo {
	public Nodo left;
	public Nodo rigth;
	public int label;
	public Boolean visited;
	public Nodo(int l) {
		this.left = null;
		this.rigth = null;
		this.label = l;
		this.visited = false;
	}
}