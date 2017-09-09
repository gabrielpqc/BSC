import java.math.BigInteger;

public class PowerDigitSum {
	//Euler Problem 16
	public static void main(String[] args) {
		
		
		BigInteger a, b, c, sum, d;
		int exponent = 1000;
		a = new BigInteger ("2");
		b = a.pow(exponent);
		c = new BigInteger ("0");
		sum = new BigInteger ("0");
		d = new BigInteger ("10");

		while (b.compareTo(c) != 0) {
            // Adiciona o ultimo digito à soma
            sum = sum.add( b.remainder(d));
            // Corta o ultimo Digito
            b = b.divide(d);
      }
		System.out.println(sum);

	}	
}
//A string é insuficiente para todos os caracteres