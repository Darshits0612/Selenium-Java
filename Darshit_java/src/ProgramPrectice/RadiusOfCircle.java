package ProgramPrectice;
import java.util.Scanner;
public class RadiusOfCircle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter redius of circle");
		double radius = sc.nextDouble();
		double area = 3.14*radius*radius;
		double circum = 2*3.14*radius;
		
		System.out.println("radius of circle = "+radius);
		System.out.println("area of circle = "+area);
		System.out.println("circum of circle = "+circum);
	}

}
