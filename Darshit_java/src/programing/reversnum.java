package programing;
import java.util.Scanner;
public class reversnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int sum=0;
		while(a!=0)
		{
			int ld=a%10;
			sum=sum*10+ld;
			a=a/10;
			
		}
		
		System.out.println(sum);
		

	}

}
