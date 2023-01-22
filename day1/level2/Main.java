public class Main {
	
	public static void main(String[] args) {
		/*
		1. What is your name?
		2. Where are you from?
		3. What is your pincode?
		*/
		Employee hrithik = new Employee("Hrithik", "Develop", 23);
		test(1)
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
	
	public static void testSwitchCase(int value){
		switch(value){
			case 1:
				System.out.Println("What is your name?");
				break;
			case 2:
				System.out.Println("Where are hyou from?");
				break;
			case 3:
				System.out.Println("Pincode");
				break;
			default:
				System.out.Println("Invalida value");
		
		}
	}
	
	public class Employee {
		public String name;
		public String department;
		public int employeeId;
	}
	
	

}
