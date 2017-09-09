import java.math.BigInteger;
	//Euler Problem 20 
public class FactorialDigitSum {

	public static void main(String[] args) {
		
		BigInteger fact, a , i, sum;
		a = new BigInteger ("100");
		i = new BigInteger ("1");
		sum = new BigInteger ("0");
		fact = new BigInteger ("1");
		
		// 10!
        for ( i = BigInteger.valueOf(1); i.compareTo(a) <= 0; 
        		i = i.add(BigInteger.ONE) ) {
        	
            fact = fact.multiply(i);
        }
        
        //Soma dos numeros --> Codigo do Exercicio Anterior
        while (fact.compareTo(BigInteger.ZERO) != 0) {
            sum = sum.add( fact.remainder(BigInteger.TEN));
            // Corta o ultimo Digito
            fact = fact.divide(BigInteger.TEN);
      }
		System.out.println(sum);
	}

}