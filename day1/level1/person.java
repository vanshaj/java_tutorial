public class person{
	String name;
	int age;
	static int legs = 2;

	public static void printLegs() {
		System.out.println(legs);
	}	

	public void sayMyName() {
		System.out.println("bye from "+ this.name);
	}
}

person hrithik = new person();
hrithik.name = "hrithik";
hrithik.age = 22;
hrithik.printLegs(); // 2

person vanshaj = new person();
vanshaj.name = "vanshaj";
vanshaj.age = 30;
vanshaj.printLegs(); // 2

hrithik.legs = 5;
hrithik.printLegs(); //5
vanshaj.printLegs(); //5

person vipul = new person();
vipul.printLegs(); 5
vipul.legs = 3;

vanshaj.printLegs(); //3
