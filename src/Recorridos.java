
public class Recorridos {
	private Nodo root;
	public Recorridos(Nodo r){
		this.root = r;
	}
	public void run(){
		preorden(this.root);
	}
	private void preorden(Nodo v){
		if(v == null) {
			return;
		}
		System.out.println(""+v.label);
		preorden(v.left);
		preorden(v.rigth);
	}
}
