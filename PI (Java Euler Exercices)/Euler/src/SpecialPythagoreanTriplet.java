
public class SpecialPythagoreanTriplet {
	//Euler Problem 9
	public static void main(String[] args) {
		int multi = 0;
		for (int i = 1; i<=500; i++){
			for (int j = 1; j<500; j++){
				double d = j;
				double e = i;
				double f = Math.sqrt((d*d)+ (e*e));
				if(d+e+f == 1000 ){
					multi = (int)(d * e * f);
					break;
				}
			} 
		}
		System.out.println(multi);
	}
}