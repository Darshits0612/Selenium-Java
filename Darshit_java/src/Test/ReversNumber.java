package Test;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int ld=num%10;
			sum=sum*10+ld;
			num=num/10;
		}
		System.out.println(sum);
	}

}
