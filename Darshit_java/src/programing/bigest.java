package programing;
import java.util.Scanner;
public class bigest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is bigest");
		}
				
		else if(b>c && b>a)
		{
			System.out.println("b is bigest");
		}
		else 
		{
			System.out.println("c is bigest");
		}
	}

}
