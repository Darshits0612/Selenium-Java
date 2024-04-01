//spy number of the giver=n number
package ProgramPrectice;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int num1=num;
		int sum = 0;
		int product = 1;
		while(num != 0) {
			int ld=num%10;
			sum=sum+ld;
			product=product*ld;
			num=num/10;
		}
		if(sum==product) {
			System.out.println(num1+" is spy number");
		}
		else{
			System.out.println(num1+" is Not spy");
		}
	}

}
