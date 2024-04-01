//wap to check wether number is perfect or not
package ProgramPrectice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("Yes it is Perfect number");
		}
		else {
			System.out.println("No it is not perfect number");
		}
		
	}

}
