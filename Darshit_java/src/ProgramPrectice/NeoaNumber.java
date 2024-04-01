//To chack Wether neoa number or not
package ProgramPrectice;

import java.util.Scanner;

public class NeoaNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int num = sc.nextInt();
		int power = num * num;
		int sum = 0;
		while (power != 0) {
			int ld = power % 10;
			sum = sum + ld;
			power = power / 10;

		}
		if (num == sum) {
			System.out.println(num + " is neoa number");
		} else {
			System.out.println(num + " is not neoa number");
		}
	}
}
