import java.util.Vector;

public class Recorridos {
	private Nodo root;
	private GenericNode another_root;
	public Recorridos(Nodo r){
		this.root = r;
	}
	public Recorridos(GenericNode r){
		this.another_root = r;
	}
	public void run(String type){
		//if (type=="profundidad")
		if(type.equals("profundidad")) {
			preorden(this.root);
		}else if(type.equals("anchura")) {
			anchura(this.root);
		}
		
	}
	public void runGeneric(String type){
		//if (type=="profundidad")
		if(type.equals("profundidad")) {
			preordenGeneric(this.another_root);
		}else if(type.equals("anchura")) {
			spanningGeneric(this.another_root);
		}
		
	}
	private void preorden(Nodo v){
		if(v == null) {
			return;
		}
		System.out.println(""+v.label);
		preorden(v.left);
		preorden(v.rigth);
	}
	// PARA ARBOLES BINARIOS
	private void anchura(Nodo root)
	{
		// PASO 1
		Vector<Nodo> Q = new Vector<Nodo>();
		//paso 2
		Q.add(root);
		root.visited = true;
		System.out.println(""+root.label);
		//Paso k
		while(Q.size() != 0) {
			Nodo v = Q.get(0);
			//PASO DEL POP
			Q.remove(0);
			// los Vertices adyacentes
			// PARA TODOS LOS VERTICES ADYACENTES A v
			if(v.left!=null)
			{
				Nodo w = v.left;
				System.out.println(""+w.label);
				w.visited = true;
				Q.add(w);
			}
			
			// para el rigth
			if(v.rigth!=null){
				Nodo w1 = v.rigth;
				System.out.println(""+w1.label);
				w1.visited = true;
				Q.add(w1);
			}
			
		}
	}
	private void preordenGeneric(GenericNode v){
		if(v == null) {
			return;
		}
		System.out.println(""+v.label);
		for(int i = 0;i<v.children.size();i++ )
		{
			preordenGeneric(v.children.get(i));
		}
		
	}
	private void spanningGeneric(GenericNode root)
		{
			// PASO 1
			Vector<GenericNode> Q = new Vector<GenericNode>();
			//paso 2
			Q.add(root);
			root.visited = true;
			System.out.println(""+root.label);
			//Paso k
			while(Q.size() != 0) {
				GenericNode v = Q.get(0);
				//PASO DEL POP
				Q.remove(0);
				// los Vertices adyacentes
				// PARA TODOS LOS VERTICES ADYACENTES A v
				for(int i=0;i<v.children.size();i++){
					GenericNode w1 = v.children.get(i);
					System.out.println(""+w1.label);
					w1.visited = true;
					Q.add(w1);
				}
				
			}
		}
	
}
