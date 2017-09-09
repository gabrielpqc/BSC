
public class Position {
	int linha;
	int coluna;
	char caracter;
	
	public Position(int linha, int coluna,char caracter){
		this.linha = linha;
		this.coluna = coluna;
		this.caracter = caracter;
	}
	
	public String toString(){
		return caracter + "(" +linha+ "," +coluna+ ")";
	}
	
	public boolean isNear(Position x){
		if( linha == x.linha+1 || //E
			linha == x.linha-1 || //O
			coluna== x.coluna+1 || //S
			coluna== x.coluna-1 || //N
			linha == x.linha+1 & coluna == x.coluna+1 || //SE
			linha == x.linha+1 & coluna == x.coluna-1|| //NE 
			linha == x.linha-1 & coluna == x.coluna+1|| //SW
			linha == x.linha-1 & coluna == x.coluna-1 	//NW
			){
			return true;
		}
		else
			return false;
	}
}
