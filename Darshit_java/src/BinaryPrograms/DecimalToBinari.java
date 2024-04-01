package BinaryPrograms;

import java.util.Scanner;

public class DecimalToBinari {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String bin=" ";
		while(num > 0 ) {
			int ld=num%2;
			bin=ld+" "+bin;
			num=num/2;
			
		}
		System.out.println(bin);
	}
}
