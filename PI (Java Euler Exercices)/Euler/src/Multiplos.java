public class Multiplos {
	 // Projecto Euler: Problema ID 1
	public static void main(String[] args) {
		int soma = 0;
		int i = 0;
		while (i < 1000){
			if (i%3 == 0 && i%5 == 0){
				soma += i;
				i ++;
			}
			else	{
				if (i%3 == 0){
					soma += i;
					i ++;
				}
				else if (i%5 == 0){
					soma += i;
					i++;
				}
				else{
					i++;
				}
			}
		}
		System.out.println(soma);
	}
}