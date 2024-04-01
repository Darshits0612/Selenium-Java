package ProgramPrectice;

import java.util.Scanner;

public class EmirpNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int r =reverce(num) ;

		boolean p1 = prime(num);
		boolean p2 = prime(r);

		if (p1 == true && p2==true) {
			
				System.out.println("yes, it is Emirp number");
			
		} else {
			System.out.println("No it's not Emirp number");
		}

	}
	
	static int reverce(int n) {
		int sum=0;
		while(n!=0) {
			int r=n%10;
			 sum=sum*10+r;
			n=n/10;
		}
		
		return sum;
	}

	static boolean prime(int n) {

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}

		}

		return count == 0;
	}

}
