import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Boogle{
		
	static HashQuadratica<String> Boogle = new HashQuadratica<>();
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String line = "";
		String file="allWords.txt";
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				Boogle.insere(line);
			}
		}
		catch(IOException e){
			System.out.println("Ups");
		}
		
		solve();
	}
	//------------------------Funções/Métodos-------------------------------
	
	public static String lerBoogle(){
		String caracteres = "";
		String line = "";
		String file="boogle.txt";
		try{
			@SuppressWarnings("resource")
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			while ((line=buffer.readLine()) != null) {
				caracteres+= line;
			}
		}
		catch(IOException e){
			System.out.println("Ups");
		}

		String controlo = " ";
		String boogle = "";
		int i = 0;
		
		while(i<caracteres.length()){
	    	if(caracteres.charAt(i)==controlo.charAt(0)){ //remove espaços
	    	   i++;
	    	}
	    	else{
	    		boogle += caracteres.charAt(i);
	    		i++;
	    	}
	    }
		return boogle;
	}
	
	public static void solve(){
		permutation(lerBoogle());
	}
	
	
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) ;
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        	if(Boogle.procurar(prefix) == true){
	        		System.out.println(prefix);
	        	}
	        
	    }
	}
}