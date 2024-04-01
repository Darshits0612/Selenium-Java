package programing;
import java.util.Scanner;
public class smallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest number");
		}
		else if(b<c && b<a)
		{
			System.out.println("b is smallest number");
		}
		else
		{
			System.out.println("c is smallest number");
		}
		
	}
}
