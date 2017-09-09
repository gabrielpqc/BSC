public class SmallestMultiple {
	 // Projecto Euler: Problema ID 5
	public static void main(String[] args) {
		int i = 19;
		boolean test = false;
		while(!test){
			boolean divisible = true;
			i+= 1;
			for(int j=1; j<=20;j++){
				if(i%j != 0){
					divisible = false;
					break;
					}
				}
			if(divisible){
				test = true;
			}
		}
		System.out.println(i);
	}
}