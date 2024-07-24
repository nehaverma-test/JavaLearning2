package testing.com;

import java.util.Scanner;

public class TriangleClassifier {

	public static void main(String[] args) {
		
		int side1, side2, side3;
		
		System.out.println("Enter the 3 sides of triangle");
		Scanner sc = new Scanner(System.in);
		side1 = sc.nextInt();
		side2 = sc.nextInt();
		side3 = sc.nextInt();
		
		if(side1 == side2 && side2 == side3)
		{
			System.out.println("It is an equilateral triangle");
			
		}
		else if(side1==side2 || side2==side3 || side1==side3)
		{
			System.out.println("It is an isosceles triangle");
			
		}
		else
			System.out.println("It is an scalene triangle");
	}
	
}
