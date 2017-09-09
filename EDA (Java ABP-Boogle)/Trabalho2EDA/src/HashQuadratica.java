
public class HashQuadratica<T> extends HashTable<T>{
	private static int tamanho = 200;
	
	public HashQuadratica(){
		criarTabela(tamanho);
	}
	
	public HashQuadratica(int tamanho) {
		criarTabela(tamanho);
		tornarVazia();
	}

	public	int proximaPosicao(T s){
		int colisoes = 1;
		int posActual = hash(s);
		while(tabela[posActual] != null && !tabela[posActual].elemento.equals(s))
		{
			posActual += colisoes*colisoes; // f(i) = i^2
			colisoes += 1;
			if(posActual >= tabela.length)
				posActual = posActual % tabela.length;
		}
		return posActual;
	}
}