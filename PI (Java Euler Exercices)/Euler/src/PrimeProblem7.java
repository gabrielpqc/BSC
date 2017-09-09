public class PrimeProblem7 {
	// Projecto Euler: Problema ID 7
	 private static boolean isPrime(int n) {
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		int current = 3;
		int counter = 1;
		int largest = 0;
		while (counter < 10001){
			if (isPrime(current)){
				largest = current;
				current += 2;
				counter +=1;
			}
			else{
				current +=2;
			}
		}
		System.out.println(largest);
	}

}