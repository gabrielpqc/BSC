import java.math.BigInteger;
 
public class Problema48
{
	public static void main(String[] args)
	{
		BigInteger sum = BigInteger.ZERO;
		BigInteger temp = BigInteger.ONE;
		BigInteger total = BigInteger.ZERO;
		BigInteger a = BigInteger.valueOf(10);
 
		for (int i = 1; i <= 1000; i++)
		{
			sum = temp.pow(i);
			temp = temp.add(BigInteger.ONE);
			total = total.add(sum);
		}
		total = total.remainder(a.pow(10));
		//total % 10^10
		System.out.println(total);
	}
}