//fibonacci series
package ProgramPrectice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int a=0;
		int b=1;
		int sum=0;
		
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=num;i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		
		
	}
}
