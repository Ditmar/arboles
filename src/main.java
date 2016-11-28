
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo root = new Nodo(1);
		root.left = new Nodo(2);
		root.rigth = new Nodo(3);
		
		Nodo aux2 = root.left;
		Nodo aux3 = root.rigth;
		
		aux2.left = new Nodo(4);
		aux2.rigth = new Nodo(5);
		aux3.left = new Nodo(6);
		aux3.rigth = new Nodo(7);
		Recorridos r = new Recorridos(root);
		r.run();
		
	}
	

}
