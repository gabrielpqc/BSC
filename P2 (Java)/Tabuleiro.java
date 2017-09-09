import java.util.ArrayList;
import java.util.Random;

public class Tabuleiro {
	
	private int tamanho = 0;
	private int score = 0;
	private ArrayList<ArrayList<Ladrilho>> tabuleiro = new ArrayList<>();
	Random random = new Random();
	private int over = 0;

	//Tabuleiro tamanho standart (4*4)
	public Tabuleiro(){
		ArrayList<ArrayList<Ladrilho>> x = new ArrayList<>();
		for(int i=0; i<4; i++){
			ArrayList<Ladrilho> y = new ArrayList<>();
			for(int j=0;j<4; j++){
				y.add(j, new Ladrilho(0));
			}
			x.add(y);
		}
		tabuleiro=x;
		tamanho=4;
	}
	
	//Tabuleiro com parâmetros (n*n)
	public Tabuleiro(int a){
		ArrayList<ArrayList<Ladrilho>> x = new ArrayList<>();
		for(int i =0; i<a; i++){
			ArrayList<Ladrilho> y = new ArrayList<>();
			for(int j=0;j<a; j++){
				y.add(j, new Ladrilho(0));
			}
			x.add(y);
		}
		tamanho = a;
		tabuleiro = x;
	}
	
	//'Desenha' o tabuleiro
	public void drawTabuleiro(){
		for(int i = 0; i<tamanho; i++){
			for(int j = 0; j<tamanho; j++){
				System.out.print(tabuleiro.get(i).get(j).getValor() + "    ");
			}
			System.out.print("\n");
		}
	}
	
	public void drawLastTabuleiro(ArrayList<ArrayList<Ladrilho>> last){
		for(int i = 0; i<tamanho; i++){
			for(int j = 0; j<tamanho; j++){
				System.out.print(last.get(i).get(j).getValor() + "    ");
			}
			System.out.print("\n");
		}
	}
	
	public void add(Ladrilho x, int i, int j){
		tabuleiro.get(i).set(j,x);
	}
	
	//Método para inicializar os 2 primeiros Ladrilhos (2 e 2/4):
	//	1: Inicializa um lugar aleatório a 2 ou 4
	//	2: Inicializa um lugar aleatório a 2
	public void addStart(){
		
		int x = random.nextInt(tamanho-1);
		int y = random.nextInt(tamanho-1);
		
		while(tabuleiro.get(x).get(y).getValor() != 0){
			x = random.nextInt(tamanho-1);
			y = random.nextInt(tamanho-1);
		}
		int valor = 2*((int)(Math.random()*2)+1);
		tabuleiro.get(x).set(y,new Ladrilho(valor));
		
		while(tabuleiro.get(x).get(y).getValor() != 0){
			x = random.nextInt(tamanho-1);
			y = random.nextInt(tamanho-1);
		}
		tabuleiro.get(x).set(y,new Ladrilho(2));
	}
	
	public void addRandom(){
		int x = random.nextInt(tamanho-1);
		int y = random.nextInt(tamanho-1);
		
		while(tabuleiro.get(x).get(y).getValor() != 0){
			x = random.nextInt(tamanho-1);
			y = random.nextInt(tamanho-1);
		}
		tabuleiro.get(x).set(y,new Ladrilho(2));
	}
	
	//Verifica se o tabuleiro actual e o tabuleiro no argumento são iguais
	public boolean equalsLast(ArrayList<ArrayList<Ladrilho>> last){
		boolean check = true;
		int count = 0;
		for(int i = 0; i<tamanho-1 ; i++){
			for(int j = 0; j<tamanho; j++){
				if(tabuleiro.get(i).get(j).getValor() != last.get(i).get(j).getValor()){
					count+=1;
				}
			}
		}
		if (count>0)
			check=false;
		return check;
	}
	
	//Método que clona o tabuleiro actual
	public ArrayList<ArrayList<Ladrilho>> clone (ArrayList<ArrayList<Ladrilho>> t){
		ArrayList<ArrayList<Ladrilho>> clone = new ArrayList<>(tamanho);
		for(int i = 0; i<tamanho; i++){
			clone.add(new ArrayList<Ladrilho>());
			for(int j = 0; j<tamanho; j++){
				int valor = t.get(i).get(j).getValor();
				clone.get(i).add( new Ladrilho(valor));
			}
		}
		return clone;
	}
	//Métodos que movem os Ladrilhos para cima
		//1: Move para cima
		//2: Soma quadrilhos iguais 2 a 2
		//3: Move para cima
	public ArrayList<ArrayList<Ladrilho>> moveCima(){
		int m = tamanho-1;		
		while(m!=0){
			for(int i = 0; i<tamanho-1 ; i++){
				for(int j = 0; j<tamanho; j++){
					int actual = tabuleiro.get(i).get(j).getValor();
					if(actual == 0){
						tabuleiro.get(i).set(j, tabuleiro.get(i+1).get(j));
						tabuleiro.get(i+1).set(j, new Ladrilho(0));
					}
				}
			}
			m-=1;
		}
		return tabuleiro;
	}
	public void cima(){
		over = 1;
		ArrayList<ArrayList<Ladrilho>> last = new ArrayList<>();
		last = clone(tabuleiro);
		moveCima();					
		int s = (int)(tamanho/2-tamanho/3);	
		while(s!=0){
			for(int i = 0; i<tamanho-1 ; i++){
				for(int j = 0; j<tamanho; j++){
					int actual = tabuleiro.get(i).get(j).getValor();
					int proximo = tabuleiro.get(i+1).get(j).getValor();
					if(actual == proximo){
						tabuleiro.get(i).set(j, new Ladrilho(2*actual));
						tabuleiro.get(i+1).set(j, new Ladrilho(0));
						score += 2*actual;
					}
				}
			}
			s-=1;
		}
		moveCima();				
		if (equalsLast(last) == false){
			addRandom();
			over = 0;
		}
	}
	
	//Métodos que movem os Ladrilhos para baixo
		//1: Move para baixo
		//2: Soma quadrilhos iguais 2 a 2
		//3: Move para baixo
	public ArrayList<ArrayList<Ladrilho>> moveBaixo(){
		int m = tamanho;	
		while(m!=0){
			for(int i=tamanho-1; i>0; i--){
				for(int j =tamanho-1; j>=0;j--){
					if(tabuleiro.get(i).get(j).getValor() == 0){
						tabuleiro.get(i).set(j, tabuleiro.get(i-1).get(j));
						tabuleiro.get(i-1).set(j, new Ladrilho(0));
					}
				}
			}
			m-=1;
		}
		return tabuleiro;
	}
	public void baixo(){
		ArrayList<ArrayList<Ladrilho>> last = new ArrayList<>();
		over = 1;
		last = clone(tabuleiro);
		moveBaixo();							
		int m = (int)(tamanho/2-tamanho/3);		
		while(m!=0){
			for(int i=tamanho-1; i>0; i--){
				for(int j =tamanho-1; j>=0;j--){
					int actual = tabuleiro.get(i).get(j).getValor();
					int proximo = tabuleiro.get(i-1).get(j).getValor();
					if(actual == proximo){
						tabuleiro.get(i).set(j, new Ladrilho(2*actual));
						tabuleiro.get(i-1).set(j, new Ladrilho(0));
						score += 2*actual;
					}
				}
			}
			m-=1;
		}
		moveBaixo();							
		if (equalsLast(last)==false){
			addRandom();
			over = 0;
		}
	}
	
	//Métodos que movem os Ladrilhos para a direita
		//1: Move para a direita
		//2: Soma quadrilhos iguais 2 a 2
		//3: Move para a direita
	public ArrayList<ArrayList<Ladrilho>> moveDireita(){
		int m = tamanho;			
		while(m!=0){
			for(int i=tamanho-1; i>=0; i--){
				for(int j =tamanho-1; j>0;j--){
					if(tabuleiro.get(i).get(j).getValor() == 0){
						tabuleiro.get(i).set(j, tabuleiro.get(i).get(j-1));
						tabuleiro.get(i).set(j-1, new Ladrilho(0));
					}
				}
			}
			m-=1;
		}
		return tabuleiro;
	}
	public void direita(){	
		over = 1;
		ArrayList<ArrayList<Ladrilho>> last = new ArrayList<>();
		last = clone(tabuleiro);
		moveDireita(); 				
		int s = (int)(tamanho/2-tamanho/3);	
		while(s!=0){
			for(int i=tamanho-1; i>=0; i--){
				for(int j =tamanho-1; j>0;j--){
					int actual = tabuleiro.get(i).get(j).getValor();
					int proximo = tabuleiro.get(i).get(j-1).getValor();
					if(actual == proximo){
						tabuleiro.get(i).set(j, new Ladrilho(2*actual));
						tabuleiro.get(i).set(j-1, new Ladrilho(0));
						score += 2*actual;
					}
				}
			}
			s-=1;
		}
		moveDireita(); 			
		if (equalsLast(last)==false){
			addRandom();
			over = 0;
		}
	}
	
	//Métodos que movem os Ladrilhos para a esquerda
		//1: Move para a esquerda
		//2: Soma quadrilhos iguais 2 a 2
		//3: Move para a esquerda
	public ArrayList<ArrayList<Ladrilho>> moveEsquerda(){
		int m = tamanho-1;		
		while(m!=0){
			for(int i = 0; i<tamanho ; i++){
				for(int j = 0; j<tamanho-1; j++){
					if(tabuleiro.get(i).get(j).getValor() == 0){
						tabuleiro.get(i).set(j, tabuleiro.get(i).get(j+1));
						tabuleiro.get(i).set(j+1, new Ladrilho(0));
					}
				}
			}
			m-=1;
		}
		return tabuleiro;
	}
	public void esquerda(){
		over = 1;
		ArrayList<ArrayList<Ladrilho>> last = new ArrayList<>();
		last = clone(tabuleiro);
		moveEsquerda();					
		int s = (int)(tamanho/2-tamanho/3);		
		while(s!=0){
			for(int i = 0; i<tamanho ; i++){
				for(int j = 0; j<tamanho-1; j++){
					int actual = tabuleiro.get(i).get(j).getValor();
					int proximo = tabuleiro.get(i).get(j+1).getValor();
					if(actual == proximo){
						tabuleiro.get(i).set(j, new Ladrilho(2*actual));
						tabuleiro.get(i).set(j+1, new Ladrilho(0));
						score += 2*actual;
					}
				}
			}
			s-=1;
		}
		moveEsquerda();					
		if (equalsLast(last)==false){
			addRandom();
			over = 0;
		}
	}

	public int getTamanho(){
		return tamanho;
	}
	
	public int getScore(){
		return score;
	}
	
	public void showScore(){
		System.out.println("\n Score: " + score);
	}
	
	//Verifica:
	//	1: se existe algum Ladrilho com o valor 2048
	//	2: se o tabuleiro anterior é igual ao actual
	//	3: se existem espaços livres
	public boolean check(){
		int a = 0;
		int b = 0;
		boolean c = false;
		for(int i = 0; i<tamanho ; i++){
			for(int j = 0; j<tamanho-1; j++){
				if(tabuleiro.get(i).get(j).getValor()==2048)
					a+=1;
				else if(tabuleiro.get(i).get(j).getValor()==0)
					b+=1;
			}	
		}
		if(a > 0){
			c = true;
			System.out.println("Parabéns!");
		}
		else if (over == 1 && b == 0){
			c = true;
			System.out.println("Game Over!");
		}
		return c;
	}
	
	//Retorna o Valor na coordenada (x,y)
	public int getValor(int x, int y){
		return tabuleiro.get(x).get(y).getValor();
	}
}
