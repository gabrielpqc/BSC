public class LargestPrimeFactor {
	
	 //Projecto Euler: Problema ID 3
	 private static boolean isPrime(long n) {
		    for (long  i = 2; i < n; i++) {
		        if (n%i == 0) {
		            return false;
		        }
		    }
		    return true;
		}
	public static void main(String[] args) {

		    long max = 600851475143L;  
		    long maxFactor = 0;

		    //Só vai testar números menores que a raiz do 'max'
		    //Só testa também números impares
		    for (long i = 3; i <= Math.sqrt(max); i += 2){
		        if (max % i == 0){
		            if (isPrime(i)) {
		                maxFactor = i;
		            }
		        }
		    }
		    System.out.println(maxFactor);
		}
	}