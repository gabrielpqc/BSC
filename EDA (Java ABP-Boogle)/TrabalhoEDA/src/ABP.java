
public class ABP<E extends Comparable<? super E>> {
	Node<E> raiz;
	
	public ABP() {
		raiz = null;
	}
	
	public boolean isEmpty() {
		return raiz == null;
	}
	
	public boolean contains(E o, Node<E> n) {
		if (n == null) {
			return false;
		}
		
		else {
			if (n.capitulo.compareTo((String) o) == 0) {
				return true;
			}
			
			if (n.capitulo.compareTo((String) o) < 0) {
				return contains(o, n.direita);
				
			}
			else {
				return contains(o, n.esquerda);
			}
		}
	}
	
	public void addNode(int pagina, String capitulo) {
		raiz = addNode(pagina, capitulo,raiz);
	}
	
	public Node<E> addNode(int pagina, String capitulo, Node<E> n) {
		if (n == null) {
    		n = new Node<E>(pagina, capitulo);
    	}
		else {
    		if (capitulo.charAt(0) < n.capitulo.charAt(0))
    			n.esquerda = addNode(pagina, capitulo, n.esquerda);
    		else
    			n.direita = addNode(pagina, capitulo, n.direita);
    	}
    	return n;
	}
	
	public void inOrder(Node<E> NodeAtual) {
		if (NodeAtual != null) {
			inOrder(NodeAtual.esquerda);
			System.out.println(NodeAtual);
			inOrder(NodeAtual.direita);

		}
	}	
}
