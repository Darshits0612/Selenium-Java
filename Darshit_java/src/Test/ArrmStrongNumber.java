package Test;

import java.util.Scanner;

public class ArrmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ending number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int j = i;
			int sum = 0;
			int count = digitCount(j);
			while (j != 0) {
				int ld = j % 10;

				sum = sum + power(ld, count);
				j = j / 10;
			}
			if (sum == i) {
				System.out.println(i);
			}

		}
	}

	static int digitCount(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	static int power(int ld, int count) {
		int sum = 1;
		for (int i = 1; i <= count; i++) {
			sum = sum * ld;
		}
		return sum;
	}

}
