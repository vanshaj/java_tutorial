public class hrithik {

public static void main(String[] args){
	//person.staticHello();
	int i = 2;
	person vanshaj = new person();
	vanshaj.name = "vansh";
	vanshaj.age = 25;
	vanshaj.sayMyName();
	
	person hrithik=new person();
        hrithik.name = "hritik";
        hrithik.sayMyName();

	hrithik.name = "akshay";

	System.out.println("-------------------------------------");

	hrithik.sayMyName();
	vanshaj.sayMyName();

	vanshaj.printLegs();
	hrithik.printLegs();
	person.printLegs();	
	System.out.println("-------------------------------------");
	
	vanshaj.legs = 3;
	vanshaj.printLegs();
	hrithik.printLegs();
	person.printLegs();	


}

}

