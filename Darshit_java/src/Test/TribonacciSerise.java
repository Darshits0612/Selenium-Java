package Test;

import java.util.Scanner;

public class TribonacciSerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		int sum=0;
		
		System.out.print(a+" "+b+" "+c+" ");
		for(int i=3;i<num;i++) {
			sum=a+b+c;
			System.out.print(sum+" ");
			a=b;
			b=c;
			c=sum;
		}
	}

}
