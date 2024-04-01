package ProgramPrectice;

import java.util.Scanner;

public class deseriumNumber {
	public static int count(int a) {
		int count1 = 0;
		while (a > 0) {
			a = a / 10;
			count1++;
		}
		return count1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start number");
		int num = sc.nextInt();
		System.out.println("enter the end number");
		int num1 = sc.nextInt();

		for (num = num; num <= num1; num++) {
			int num2 = num;
			int count1;
			int ld;
			int sum = 1;
			int sum1 = 0;
			count1 = count(num);
			while (num > 0) {

				ld = num % 10;
				sum = 1;

				for (int i = count1; i >= 1; i--) {

					sum = sum * ld;
				}
				sum1 = sum1 + sum;
				num = num / 10;

			}
			if (sum1 != num1) {
				System.out.println(num1);
			}

		}
	}
}
