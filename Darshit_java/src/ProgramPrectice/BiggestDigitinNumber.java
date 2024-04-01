package ProgramPrectice;
import java.util.Scanner;

public class BiggestDigitinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int big=0;
		while(num != 0)
		{
			
			int r=num%10;
			if(big < r)
			{
				big=r;
			}
			num=num/10;
		}
		System.out.println("the biggest number is = "+big);
	}

}
