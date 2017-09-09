import java.math.BigInteger;

public class Problema56 {
	
	//Algoritmo para calcular os exponenciais entre BigInts
	static BigInteger pow(BigInteger base, BigInteger exponent) {
		  BigInteger result = BigInteger.ONE;
		  while (exponent.signum() > 0) {
		    if (exponent.testBit(0)) result = result.multiply(base);
		    base = base.multiply(base);
		    exponent = exponent.shiftRight(1);
		  }
		  return result;
		}
	
	public static void main(String[] args) {
		
		BigInteger n = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		BigInteger hundred = BigInteger.valueOf(100);
		BigInteger i = BigInteger.ZERO;
		BigInteger j = BigInteger.ZERO;
		
		for(i = BigInteger.valueOf(0); i.compareTo(hundred) < 0; i = i.add(BigInteger.ONE)){
			for(j = BigInteger.valueOf(0); j.compareTo(hundred) < 0; j = j.add(BigInteger.ONE)){
				n = pow(i,j);
				BigInteger tempsum = BigInteger.ZERO;
				
				//Algoritmo para calcular a soma dos numeros (Utilizado em exercicios anteriores 20,53)
				while (n.compareTo(BigInteger.ZERO) != 0) {
		            tempsum = tempsum.add(n.remainder(BigInteger.TEN));
		            n = n.divide(BigInteger.TEN);
				}
				if(tempsum.compareTo(sum) == 1){
					sum = tempsum;
				}
			}
		}
		System.out.println(sum);
	}
}