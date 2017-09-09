
public class Node<E> {
	int pagina;
	String capitulo;
	Node<E> esquerda;
    Node<E> direita;

    public Node(int pagina, String capitulo) {
    	this.capitulo = capitulo;
		this.pagina= pagina;
	}
	public String toString() {
		String capituloatual = "";
		for(int i = 0; i<capitulo.length();i++){
			if(capitulo.charAt(i) == '!'){
				String[] separar = capitulo.split("\\!");
				return separar[0] + ": " + pagina + "\n" + "\t" + separar[1];
			}
			else{
				capituloatual+= capitulo.charAt(i);
			}
		}
		return capituloatual+ ": " + pagina;
	        
    }
}
