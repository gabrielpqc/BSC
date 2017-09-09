import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogo_2048 {
	
	public static void menu(){
		System.out.println("Escolha um menu:");
		System.out.println("1: Jogar");
		System.out.println("0: Sair");
	}
	
	public static void submenu(){
		System.out.println("Escolha o tamanho do tabuleiro:");
	}
	
	public static void jogada(){
		System.out.println("Efectue uma jogada:");
		System.out.println("c = Cima");
		System.out.println("b = Baixo");
		System.out.println("e = Esquerda");
		System.out.println("d = Direita");
	}
		
	public static void main(String[] args) {
		
		int in = 0;
		boolean done = false;
		while(done != true){
			try{
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				menu();
				in = input.nextInt();
				if( in<0 || in>1) throw new InputMismatchException();
				done = true;
				
			}
			catch(InputMismatchException e){
				System.out.println("Por favor insira um número (0 ou 1):");
				
			}
		}
		
		if(in==1){
			in=0;
			done = false;
			while(done != true){
				try{
					@SuppressWarnings("resource")
					Scanner input2 = new Scanner(System.in);
					submenu();
					in = input2.nextInt();
					if(in<4 || in>15) throw new InputMismatchException();
					done = true;
				}
				catch(InputMismatchException e){
					System.out.println("Por favor insira um número entre 4 e 15");
					
				}
			}
			
			//Inicialização
			Tabuleiro tabuleiro = new Tabuleiro(in);
			tabuleiro.addStart();
			tabuleiro.drawTabuleiro();
			jogada();
			String baixo = "b";
			String cima = "c";
			String esquerda = "e";
			String direita = "d";
			
			while(true){
				if (tabuleiro.check()==true)
					break;
				String jogada = new String();
				@SuppressWarnings("resource")
				Scanner iJogada = new Scanner(System.in);
				jogada = iJogada.next();

				if (jogada.equals(cima))
					tabuleiro.cima();
				else if (jogada.equals(baixo))
					tabuleiro.baixo();
				else if (jogada.equals(esquerda))
					tabuleiro.esquerda();
				else if (jogada.equals(direita))
					tabuleiro.direita();
				else{
					System.out.println("Jogada inválida!");
					break;
				}
				tabuleiro.drawTabuleiro();
				tabuleiro.showScore();
				System.out.println("\n");
				if (tabuleiro.check()==true){
					break;
				}	
			}
		}
		else
			System.out.println("Obrigado por jogar!");
		
	}
}
