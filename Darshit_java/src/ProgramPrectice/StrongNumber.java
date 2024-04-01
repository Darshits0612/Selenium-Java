package ProgramPrectice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int num1 = num;
		int sum = 0;
		while (num != 0) {
			int ld = num % 10;
			sum = sum + fectorial(ld);
			num = num / 10;
		}
		if (num1 == sum) {
			System.out.println("Yes number is strong");
		} else {
			System.out.println("No it is Not Strong");
		}

	}

	public static int fectorial(int n) {
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			sum = sum * i;
		}
		return sum;
	}

}
