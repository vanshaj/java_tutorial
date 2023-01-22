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

	String[] names = new String[3];
	names[0] = "abc";
	names[1] = "def";
	names[2] = "xyz";
	
	int[] numbers = new int{1,2,3,4,5};
	
	for(i=0;i<names.Length;i++){
		System.out.Println(names[i]);
	}
	
}

}

