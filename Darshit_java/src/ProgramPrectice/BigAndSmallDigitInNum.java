//
package ProgramPrectice;
import java.util.Scanner;
public class BigAndSmallDigitInNum {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		int big=0;
		int small=9;
		while(num != 0) {
			int r=num%10;
			if(big < r)
			{
				big=r;
			}
			else if(small > r){
				small=r;
			}
			num=num/10;
		}
		System.out.println("the big digite is "+big+" and small digite is "+small);
	}
}
