
public class SumSquareDifference {
	
	//Euler Project 6
	public static void main(String[] args) {
		
		int sum = 0;
		int square = 0;
		int n = 100;
		
		for (int i = 1; i <= n; ++i){
            sum += i * i;
        }
		for (int i = 1; i <= n; ++i){
            square += i;
        }
		square = (int) Math.pow(square, 2);
		int diff = square - sum;
        System.out.println(diff);

	}

}
