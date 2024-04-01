package Test;

import java.util.Scanner;

public class DecimalInToBinari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		String bin=" ";
		
		while(num != 0) {
			
			int ld=num%2;
			bin=ld+" "+bin;
			num=num/2;
		}
		System.out.println(bin);
	}

}
