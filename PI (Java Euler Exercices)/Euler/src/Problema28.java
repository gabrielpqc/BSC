
public class Problema28 {

	public static void main(String[] args) {
		int n = 1001;
		long sum = 1; 
		for (int i = 3; i <= n; i += 2){
			sum += 4 * i * i- 6 * (i - 1);
		}
		System.out.println(sum);

	}

}
