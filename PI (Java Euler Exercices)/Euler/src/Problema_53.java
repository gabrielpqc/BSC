import java.math.BigInteger;
public class Problema_53 {
	
	//Algoritmo para calcular as Combinações
	static BigInteger binomial(final int N, final int K) {
	    BigInteger ret = BigInteger.ONE;
	    for (int k = 0; k < K; k++) {
	        ret = ret.multiply(BigInteger.valueOf(N-k))
	                 .divide(BigInteger.valueOf(k+1));
	    }
	    return ret;
	}

	public static void main(String[] args) {
				BigInteger MILLION = BigInteger.TEN.pow(6);
				int count = 0;
				for (int n = 1; n <= 100; n++) {
					for (int r = 0; r <= n; r++) {
						if (binomial(n, r).compareTo(MILLION) > 0)
							count++;
					}
				}
				System.out.println(count);
		}
}