package Test;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Row number");
		int num=sc.nextInt();
		int t=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
			   if(t!=10) {
				System.out.print(t+" ");
				t++;
			   }
			   else {
				   t=1;
				   System.out.print(t+" ");
				   t++;
			   }
			   
			}
			System.out.println();
		}

	}

}
