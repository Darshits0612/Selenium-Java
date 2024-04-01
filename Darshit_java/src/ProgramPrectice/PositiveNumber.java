package ProgramPrectice;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Any number");
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println("number is Positive");
		} else {
			System.out.println("Number is nagative");
		}

	}

}
