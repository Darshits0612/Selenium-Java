package Test;

import java.util.Scanner;

public class PowerOfNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base value");
		int base=sc.nextInt();
		System.out.println("enter the Power value");
		int power=sc.nextInt();
		int sum=1;
		for(int i=1;i<=power;i++) {
			sum=sum*base;
		}
		System.out.println(sum);
	}

}
