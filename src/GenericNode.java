import java.util.Vector;

public class GenericNode {
	public Vector<GenericNode>children;
	public int label;
	public Boolean visited;
	public GenericNode(int l) {
		this.children = new Vector<GenericNode>();
		this.label = l;
		this.visited = false;
	}
}
