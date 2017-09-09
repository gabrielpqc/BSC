import java.math.BigInteger;

public class Problema97 {
	/* Calcular os 10 ultimos de 2^7830457
	 * Multiplicar n por 28433 e ficar so com os ultimos 10 digitos
	 * Adicionar 1 a n e ficar so com os ultimos 10 digitos (ultima parte redundante)
	 * */
	public static void main(String[] args) {
		BigInteger rest = BigInteger.TEN.pow(10);
		BigInteger n = BigInteger.valueOf(2).modPow(BigInteger.valueOf(7830457),rest);
		n = n.multiply(BigInteger.valueOf(28433)).mod(rest);
		n = n.add(BigInteger.ONE).mod(rest);
		System.out.println(n);

	}

}
