package Test;

import java.util.Scanner;

public class EvenOrOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;
		int count1=0;
		while(num != 0) {
			int ld=num%10;
			if(ld%2==0) {
				count++;
			}
			else {
				count1++;
			}
			num=num/10;
		}
		System.out.println("the even digit is = "+count);
		System.out.println("the odd digit is = "+count1);
	}

}
