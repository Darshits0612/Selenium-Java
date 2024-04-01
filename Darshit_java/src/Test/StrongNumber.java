package Test;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		while(num!=0) {
			int ld=num%10;
			sum=sum+fectorial(ld);
			num=num/10;			
		}
		if(num1==sum) {
			System.out.println("Yes it is a Strong number");
		}
		else {
			System.out.println("No it is not Strong number");
		}
		
	}
	static int fectorial(int ld) {
		int sum=1;
		for(int i=1;i<=ld;i++) {
			sum=sum*i;
		}
		return sum;
	}

}
