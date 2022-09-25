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
		
	}

	public static void narrow(int chotaJar) {
		System.out.println(chotaJar);
	}

	public static void widen(double badaJar) {
		System.out.println(badaJar);
	}

}
