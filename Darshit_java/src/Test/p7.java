package Test;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row number");
		int num = sc.nextInt();
		
		int t = 1;
		for (int i = 1; i <= num; i++) {
			if (i == 2) {

			} else {
				for (int j = i; j < num; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(t + " ");
					t++;
				}
				t--;
				System.out.println();
			}
		}
	}

}
