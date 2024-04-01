package Test;

import java.util.Scanner;

public class SpyNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		while(num!=0) {
			int ld=num%10;
			sum=sum+ld;
			product=product*ld;
			num=num/10;
			
		}
		if(sum==product) {
			System.out.println("yes it is spy number");
		}
		else {
			System.out.println("NO it is not a spy number");
		}
	}

}
