
public class Problema29 {

	public static void main(String[] args) {
		//Contar quantos numeros há
		int n = 0;
		for(int i = 2; i<100; i++){
			for(int j = 2; j<100; j++){
				n+=1;
			}
		}
		//System.out.println(n-1); = 15	
		
		int[] numbers = new int[n];
		int k = 0;
		for(int i = 2; i<100; i++){
			for(int j = 2; j<100; j++){
				numbers[k]=(int)Math.pow(i,j);
				k+=1;
				//System.out.println(k-1);
			}
		}
		
		//System.out.println(numbers.length); = 16
		int l = 0;
		int[] numbers2 = new int[n];
		for (int i = 0; i<numbers.length; i++){	
			if(numbers[i] != numbers2[i]){
				numbers2[i]=numbers[i];
				;
			}
			if(numbers[i] != 0){
				l+=1;
			}
		}
		System.out.println(l);
	}
}