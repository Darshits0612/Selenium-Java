package programing;
import java.util.Scanner;

public class Fectorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		int sum=1;
		for(int i=2;i<=a;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
		
	}

}
