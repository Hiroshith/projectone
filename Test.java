package Inheritance;

import java.util.Scanner;

class Test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS: ");
		int r=sc.nextInt();
		Circle c=new Circle();
		System.out.println(c.area(r));
		System.out.println(c.perimeter(r));
		sc.close();
		
		
		
	}

}
