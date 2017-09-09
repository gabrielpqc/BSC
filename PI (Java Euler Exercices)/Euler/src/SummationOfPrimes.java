
public class SummationOfPrimes {
	//Euler Problema 10
	private static boolean isPrime(long n) {
	    for (long  i = 2; i < n; i++) {
	        if (n%i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
	
		long max = 2000000;
		long sum = 2; //--> Como i começa em 3, sum é inicializada em 2
		for(int i = 3; i < max; i+=2){
			if(isPrime(i)){
				sum +=i;
			}
		}
		System.out.println(sum);
		//Demora o seu tempo
	}
}