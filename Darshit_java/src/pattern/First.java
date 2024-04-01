package pattern;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int num = sc.nextInt();
		int n = 1;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 5; j++) {

				if (n != 10) {
					System.out.print(n + " ");
					n++;

				} else {
					n = 1;
					System.out.print(n + " ");
					n++;
				}
			}
			System.out.println();
		}
	}

}
