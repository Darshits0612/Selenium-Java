package Test;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class FibonacciSerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		
		System.out.print(a+" "+b+" "+" ");
		for(int i=2;i<num;i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}

}
