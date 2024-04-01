package ProgramPrectice;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int j = i;
			int count = countDigit(j);
			while (j != 0) {
				int ld = j % 10;

				sum = sum + Power(ld, count);
				j = j / 10;
			}
			if (i == sum) {
				System.out.println(i + " ");
			}
		}
	}

	public static int Power(int ld, int digit) {
		int sum = 1;
		for (int i = 1; i <= digit; i++) {
			sum = sum * ld;
		}
		return sum;

	}

	public static int countDigit(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

}
