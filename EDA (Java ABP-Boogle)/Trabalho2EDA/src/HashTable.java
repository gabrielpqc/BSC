public abstract class HashTable<T> {
	public ElementoTabela<T> [] tabela; 
	private int ocupados; 
	
	private boolean estaActivo( int PosicaoAtual ){
		return tabela[PosicaoAtual] != null && tabela[PosicaoAtual].activo;
	}
	
	public int ocupados(){
		return ocupados;
	}
	
	//--------Função Hash-------
	//Ex: "laughter"
	//15 * valorHash + 'l' = 108
	//15 * 108 + a = 1717
	//... 
	//valorHash %= tamanho = -176 + 200 = 76
	
	public int hash(T s){
		int valorHash = 0;

		for(int i = 0; i < ((String) s).length(); i++)
			valorHash = 15 * valorHash + ((String) s).charAt(i);
			
		valorHash %= tamanho();
		if(valorHash < 0 )
			valorHash += tamanho();
		return valorHash;
	}

	public int tamanho(){
		return tabela.length;
	}
	
	abstract int proximaPosicao(T s);
	
	@SuppressWarnings("unchecked")
	public void criarTabela(int dim){
		tabela = (ElementoTabela<T>[])new ElementoTabela[proximoPrimo(dim)];
	}
	
	//-----Algoritmos para calcular o próximo número primo----
	
	private boolean ePrimo(int n){
        if( n == 1 || n % 2 == 0 )
            return false;
        if( n == 2 || n == 3 )
            return true;
        for( int i = 3; i * i <= n; i += 2 )
            if( n % i == 0 )
                return false;
        
        return true;
    }
	
	private int proximoPrimo(int n){
        if( n % 2 == 0 )
            n++;
        for(;!ePrimo(n); n += 2 )
            ;
        return n;
    }
	
	public void tornarVazia(){
        ocupados = 0;
        for( int i = 0; i < tabela.length; i++)
        	tabela[i] = null;
	}
	
	public boolean procurar(T x){
		int posActual = proximaPosicao(x);
		return estaActivo(posActual);
	}
	
	//----------Insere-------
	//Insere o elemento x como activo
	//Se o elemento já se encontrar na tabela não faz nada
	//Se 80% da tabela estiver ocupada faz o rehash
	
	public void insere(T x){
		int posActual = proximaPosicao(x);
		if(estaActivo(posActual))
			return;
		tabela[posActual] = new ElementoTabela<T>( x, true );
		ocupados++;
		if( ocupados > tabela.length / 1.2 )
			rehash();
	}
	
	//-------Rehash-------
	//Criar uma tabela com o dobro do tamanho da antiga
	//Copia os elementos da antiga tabela para a nova
	
	public void rehash(){
		ElementoTabela<T> [ ] tabelaAntiga = tabela;
		criarTabela(proximoPrimo(2*tabelaAntiga.length));
		ocupados = 0;
		for( int i = 0; i < tabelaAntiga.length; i++ )
			if(tabelaAntiga[i] != null && tabelaAntiga[i].activo)
				insere(tabelaAntiga[i].elemento);
	}	
	
	public String toString(){
		StringBuffer buffer = new StringBuffer();

	    buffer.append(System.getProperty("line.separator"));
	    buffer.append("{");
	    buffer.append(System.getProperty("line.separator"));

	    for (int i = 0; i < this.tabela.length; i++) {
	    	if (this.tabela[i] != null) {
	    		buffer.append("\t"+this.tabela[i].toString());
	    		buffer.append(System.getProperty("line.separator"));
	    	}
	    }

	    buffer.append("}");

	    return buffer.toString();
	}
	
	public void print(){
		System.out.println("\nHashTable: ");
		System.out.println(toString());
	}
}
