package Test;

import java.util.Scanner;

public class DecimalIntoHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		String s=" ";
		while(num!=0) {
			int r=num%16;
		     switch(r) {
		     case 11:s='A'+s;
		     break;
		     case 12:s='B'+s;
		     break;
		     case 13:s='c'+s;
		     break;
		     case 14:s='D'+s;
		     break;
		     case 15:s='E'+s;
		     break;
		     case 16:s='F'+s;
		     break;
		     default:s=r+s;
		     }
			num=num/16;
		}
		System.out.println(s);
	}

}
