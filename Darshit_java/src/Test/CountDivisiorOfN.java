package Test;

import java.util.Scanner;

public class CountDivisiorOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the any number");
		int num = sc.nextInt();
		int count=0;
		for (int i = 1; i < num; i++) {
			
			if(num%i==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total divisior is = "+count);
	}

}
