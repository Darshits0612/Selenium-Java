package BinaryPrograms;

import java.util.Scanner;

public class DecimalIntoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int num=sc.nextInt();
		String bin=" ";
		while(num != 0) {
			int ld=num%8;
			bin=ld+bin;
			num=num/8;
		}
		System.out.println(bin);
	}

}
