package ProgramPrectice;
import java.util.Scanner;

public class SmallestDigitinNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int small=9;
		while(num != 0)
		{
			
			int r=num%10;
			if(small > r)
			{
				small=r;
			}
			num=num/10;
		}
		System.out.println("the biggest number is = "+small);
	}

}
