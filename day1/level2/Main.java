public class Main {
	
	public static void main(String[] args) {
		int one = 10;
		int two = 30;
		String three = "sdadssa";
		//int calculate = calculator.add(three, two);
		int calculate = calculator.add(one, two);
		//System.out.println(calculate);
		
		int chotaJar = 50;
		widen(chotaJar);

		double badaJar = 50.7;
		int chotaJar1 = (int) badaJar;
		narrow(chotaJar1);

/////////////////OPERATIONS//////////////////////////////////////////////////////////
		
		int sumOfAll = 0;
		for(int i=0; i<10; i++) {
			sumOfAll = sumOfAll + i;
		}
		System.out.println("From for block Sum of 0-9 is " + sumOfAll);
		
		sumOfAll = 0;	
		int i = 10;
		while(i<10) {
			sumOfAll = sumOfAll + i;
			i++;	
		}
		System.out.println("From while block Sum of 0-9 is " + sumOfAll);

	}

	public static void narrow(int chotaJar) {
		System.out.println(chotaJar);
	}

	public static void widen(double badaJar) {
		System.out.println(badaJar);
	}

}
