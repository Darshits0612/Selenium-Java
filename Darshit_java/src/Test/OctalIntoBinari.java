package Test;

import java.util.Scanner;

public class OctalIntoBinari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the octal value");
		int num=sc.nextInt();
		String s=" ";
		while(num>0) {
			int r=num%2;
			s=r+s;
			num=num/2;
		}
		System.out.println(s);
	}

}
