package practicecalculator;

import java.util.Scanner;

public class practicecalculator {

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		num=sc.nextInt();
		int i = 0;
		for (i=2; i<num;i++) {
			if(num%i==0) {
				System.out.println("its not aprime no.");
				break;
			}
		}
		if (i==num) {
			System.out.println("its a prime");
		}
		
//		int num1,num2;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the first no.");
//		num1= sc.nextInt();
//		System.out.println("Enter the 2nd no.");
//		num2 = sc.nextInt();
//		do {
//			System.out.println("What operation you want to perform");
//			System.out.println("1. Addition");
//			System.out.println("2. Subtraction");
//			int operation = sc.nextInt();
//			if (operation == 1) {
//				int calculate = add(num1, num2);
//				System.out.println("Addition " +calculate);
//				break;
//			} else if (operation == 2) {
//				int calculate = subtract(num1, num2);
//				System.out.println("substraction " +calculate);
//				break;
//			} else {
//				System.out.println("Incorrect option chosen, please choose the correct option");
//				continue;
//			}
//		} while(true);
//		
//		
//		
//		for(int i = 0; i<10; i++) {
//			if (i%2 == 0 ) {
//				System.out.print(i);
//			} else {
//				continue;
//			}
//			System.out.println(" - - I have found even - - ");
//		}
//		
//		System.out.println("out of break");
		
	}
		// TODO Auto-generated method stub

	
	public static int add(int x, int y) {
	int sum;
	sum = x+y;
	return sum;
	

}
	public static int subtract(int x, int y) {
		int minus;
		minus = x-y;
		return minus;
}
	
}