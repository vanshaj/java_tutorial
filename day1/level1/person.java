public class person{
	static String name = "" ;
	int age;
	static int legs = 2;

	public static void printLegs() {
		System.out.println(legs);
	}	

	public void sayMyName() {
		System.out.println("bye from "+ this.name);
	}
}
