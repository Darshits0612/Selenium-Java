package Test;

import java.util.Scanner;

public class DecimalIntoOctal{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal value");
		int num=sc.nextInt();
		String s=" ";
		
		while(num!=0) {
			int r=num%8;
			s=r+s;
			num=num/8;
		}
		System.out.println(s);
	}
}
