package BinaryPrograms;

import java.util.Scanner;

public class DecimalIntohexaDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimalvalue");
		int num=sc.nextInt();
		String bin=" ";
		char ch='A';
		
		while(num != 0) {
			int ld=num%16;
			switch	(ld)	
			{
			case	10:	bin='A'+" "+ bin;
			break;
			case	11:	bin='B'+" "+ bin;
			break;
			case	12:	bin='C'+" "+ bin;
			break;
			case	13:	bin='D'+" "+ bin;
			break;
			case	14:	bin='E'+" "+ bin;
			break;
			case	15:	bin='F'+" "+ bin;
			break;
			default: bin=ld +" "+ bin;
			break;
			}
			
			num=num/16;
		}
		System.out.println(bin);
	}

}
