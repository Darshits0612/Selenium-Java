package programing;
import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s=" ";
		while(a<8)
		{
		    int r=a%2;
			s=r+s;
			a=a/2;
		}
		System.out.println(s);
	}

}
