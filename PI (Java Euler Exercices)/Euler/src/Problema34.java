public class Problema34 {
	//Bruteforce do calculo dos factoriais:
	private static int[] fac = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
	//Algoritmo para calcular o factorial:
	private static int factorial(int x) {
		int sum = 0;
		while (x != 0) {
			sum += fac[x % 10];
			x /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 3; i < 10000000; i++) {
			if (i == factorial(i))
				sum += i;
		}
		System.out.println(sum);
	}
}