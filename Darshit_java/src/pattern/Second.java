package pattern;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the Row");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (n != 1) {
					System.out.print(n + " ");
					n++;
				} else {
					System.out.print(n + " ");
					n--;
				}
			}
			System.out.println();
		}
	}

}
