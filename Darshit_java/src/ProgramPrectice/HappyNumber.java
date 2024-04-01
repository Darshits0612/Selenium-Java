package ProgramPrectice;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=1000;i++) {
		boolean a=happy(i);
		if(a==true) {
		System.out.println(i);
		}
		}

	}
	static boolean happy(int n) {
		while(n>9) {
			int sum=0;
			while(n>0) {
				int r=n%10;
				sum=sum+r;
				n=n/10;
				
			}
			n=sum;
		}
		return n==1||n==7;
	}

}
