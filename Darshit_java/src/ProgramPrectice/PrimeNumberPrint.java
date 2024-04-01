//Prime number 
package ProgramPrectice;

import java.util.Scanner;

public class PrimeNumberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int st = sc.nextInt();
		System.out.println("enter the Ending number");
		int ed = sc.nextInt();

		for (int i = st; i <= ed; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}

}
