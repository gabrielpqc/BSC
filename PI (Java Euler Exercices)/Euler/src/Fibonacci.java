
public class Fibonacci {
	
	//Euler Problem 2
	public static void main(String[] args) {
		long num1 = 0;
		long num2 = 1;
		long num3 = num1 + num2;
		long sum = 0;
        while (num3 < 4000000) {
            if (num3 % 2 == 0){
            	sum += num3;
            }
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
            }
        System.out.println(sum);
        }
	}