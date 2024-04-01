package ProgramPrectice;

import java.util.Scanner;

public class SideOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of sqeare");
		double side = sc.nextDouble();
		double area = side * side;
		double perimeter = 4 * side;

		System.out.println("side of the squareer " + side);
		System.out.println("side of the area is = " + area);
		System.out.println("side of the perimeter is = " + perimeter);

	}

}
