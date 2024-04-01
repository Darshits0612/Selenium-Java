package Test;

import java.util.Scanner;

public class ProductOfEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int Product = 1;
		while (num != 0) {
			int ld = num % 10;
			Product = Product * ld;
			num = num / 10;

		}
		System.out.println("the product of each digit is "+Product);
	}

}
