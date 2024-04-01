package Test;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the row number");
			int num=sc.nextInt();
			int t=1;
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=i;j++) {
					if(t!=0) {
						System.out.print(t+" ");
						t--;
					}
					else {
						System.out.print(t+" ");
						t++;
					}
				}
				System.out.println();
			}
	}

}
