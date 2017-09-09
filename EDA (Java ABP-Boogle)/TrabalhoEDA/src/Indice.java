import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Indice<E> {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Ler Ficheiro
		ABP Arvore = new ABP();
		QueueArray<String> fila= new QueueArray<String>();
		
		String line = "";
	    String test = "";
	    String file="file.txt";
	    String ficheiro = "";
	    
	    try{
	      @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
	      while ((line = br.readLine()) != null) {
	        	test+=line;
	      }
	    }
	    catch(IOException e){ 
	      System.out.println("Ups");
	    }
		
	    //Tratar o conteudo do ficheiro
	    String controlo = " IX:()|}!";
	    int i = 0;
	    
	    while(i<test.length()){
	    	if(test.charAt(i)==controlo.charAt(0) ||
	    	   test.charAt(i)==controlo.charAt(2) ||
	    	   test.charAt(i)==controlo.charAt(3) ||	
	    	   test.charAt(i)==controlo.charAt(4) ||	
	    	   test.charAt(i)==controlo.charAt(5) ||
	    	   test.charAt(i)==controlo.charAt(6) ||
	    	   test.charAt(i)==controlo.charAt(7)){ //remove caracteres (não os escrevendo)
	    	   i++;
	    	}
	    	else if(test.charAt(i)==controlo.charAt(1)){
	    		fila.enqueue(ficheiro);  //Se o caracter for 'I' adiciona 'ficheiro' à Queue
	    		ficheiro = "";
	    		i++;
	    	}
	    	else{
	    		ficheiro += test.charAt(i);
	    		i++;
	    	}
	    }
	    
	    //adicionar o ultimo capitulo à queue
	    if( ficheiro!= ""){
	    	 fila.enqueue(ficheiro);
	    }
	    fila.dequeue(); //Para não causar erros
	    
	    //Tirar da Queue e adicionar À àrvore
	    while (fila.size()!=0){
	    	i=0;
	    	String[] sequencia = new String[5];
	    	test = (String)fila.dequeue();
	    	sequencia=test.split("\\{");
	    	Arvore.addNode(Integer.parseInt(sequencia[2]), sequencia[1]);
	    
	    }
	    
		Arvore.inOrder(Arvore.raiz);
	}	
}
