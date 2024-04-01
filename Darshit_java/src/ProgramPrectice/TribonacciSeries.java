package ProgramPrectice;

import java.util.Scanner;

public class TribonacciSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enterr the number");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		int sum=0;
		
		System.out.print(a+" "+b+" "+c+" ");
		for(int i=4;i<=num;i++) {
			sum=a+b+c;
			System.out.print(sum+" ");
			a=b;
			b=c;
			c=sum;
		}
		
	}

}