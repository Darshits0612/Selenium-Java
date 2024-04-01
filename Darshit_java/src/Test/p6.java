package Test;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row number");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			int t=num;
			for (int j = num; j > i; j--) {
				System.out.print("  ");
				t--;
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(t+ " ");
				t--;
			}
			System.out.println();
		}
	}

}
