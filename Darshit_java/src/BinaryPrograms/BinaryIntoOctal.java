package BinaryPrograms;

import java.util.Scanner;

public class BinaryIntoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the binary number: ");
		String binaryNumber = scanner.nextLine();

		int decimalNumber = Integer.parseInt(binaryNumber, 2);
		int octalNumber = Integer.parseInt(Integer.toOctalString(decimalNumber));

		System.out.println("The octal equivalent of the binary number is: " + octalNumber);

	}

}
