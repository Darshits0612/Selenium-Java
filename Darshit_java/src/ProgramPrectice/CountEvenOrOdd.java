//count how many Even digit or odd digit in number
package ProgramPrectice;

import java.util.Scanner;

public class CountEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		int count1 = 0;
		while (num != 0) {
			int ld = num % 10;
			if (num % 2 == 0) {
				count++;
			} else {
				count1++;
			}
			num = num / 10;
		}
		System.out.println("Total even number is = " + count);
		System.out.println("Total odd number is = " + count1);
	}

}
